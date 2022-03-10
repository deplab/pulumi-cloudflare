// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class DevicePostureIntegrationConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The third-party API's URL.
        /// </summary>
        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        /// <summary>
        /// The third-party authorization API URL.
        /// </summary>
        [Input("authUrl")]
        public Input<string>? AuthUrl { get; set; }

        /// <summary>
        /// The client identifier for authenticating API calls.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The client secret for authenticating API calls.
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        public DevicePostureIntegrationConfigArgs()
        {
        }
    }
}