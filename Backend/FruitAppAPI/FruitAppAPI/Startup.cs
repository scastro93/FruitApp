﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Configuration;
using Microsoft.EntityFrameworkCore;

using FruitAppAPI.DBContexts;
using FruitAppAPI.Services.Interfaces;
using FruitAppAPI.Services;
using Neo4jClient;

namespace FruitAppAPI
{
    public class Startup
    {
        public IConfiguration Configuration { get; }
        private IHostingEnvironment _env;
        public Startup(IConfiguration configuration, IHostingEnvironment env)
        {
            Configuration = configuration;
            _env = env;
        }

        public void ConfigureServices(IServiceCollection services)
        {
            IGraphClient graphClient = new GraphClient(new Uri(Configuration.GetValue<string>("Neo4j")));
            graphClient.Connect();

            services.AddSingleton(graphClient);

            services.AddDbContext<AppDBContext>(options =>
            {
                if (_env.IsDevelopment())
                {
                    options.UseInMemoryDatabase("DB");
                }
                else
                {
                    options.UseSqlServer(Configuration.GetValue<string>("SQL"));
                }
            });

            services.AddScoped<IProviderService, ProviderService>();
            services.AddScoped<ICertificatesService, CertificatesService>();
            services.AddScoped<IFruitGraphService, FruitGraphService>();
            services.AddScoped<IProvidersGraphService, ProviderGraphService>();

            services.AddMvc();
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }

            app.UseMvc(config =>
            {
                config.MapAreaRoute(
                    "api",
                    "api",
                    "{area:exists}/{controller}/{action}/{id?}");
            });
        }
    }
}
