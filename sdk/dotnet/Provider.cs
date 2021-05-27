// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// The provider type for the cloudflare package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [CloudflareResourceType("pulumi:providers:cloudflare")]
    public partial class Provider : Pulumi.ProviderResource
    {
        /// <summary>
        /// Configure API client to always use that account
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// The API key for operations.
        /// </summary>
        [Output("apiKey")]
        public Output<string?> ApiKey { get; private set; } = null!;

        /// <summary>
        /// The API Token for operations.
        /// </summary>
        [Output("apiToken")]
        public Output<string?> ApiToken { get; private set; } = null!;

        /// <summary>
        /// A special Cloudflare API key good for a restricted set of endpoints
        /// </summary>
        [Output("apiUserServiceKey")]
        public Output<string?> ApiUserServiceKey { get; private set; } = null!;

        /// <summary>
        /// A registered Cloudflare email address
        /// </summary>
        [Output("email")]
        public Output<string?> Email { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("cloudflare", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configure API client to always use that account
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Whether to print logs from the API client (using the default log library logger)
        /// </summary>
        [Input("apiClientLogging", json: true)]
        public Input<bool>? ApiClientLogging { get; set; }

        /// <summary>
        /// The API key for operations.
        /// </summary>
        [Input("apiKey")]
        public Input<string>? ApiKey { get; set; }

        /// <summary>
        /// The API Token for operations.
        /// </summary>
        [Input("apiToken")]
        public Input<string>? ApiToken { get; set; }

        /// <summary>
        /// A special Cloudflare API key good for a restricted set of endpoints
        /// </summary>
        [Input("apiUserServiceKey")]
        public Input<string>? ApiUserServiceKey { get; set; }

        /// <summary>
        /// A registered Cloudflare email address
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Maximum backoff period in seconds after failed API calls
        /// </summary>
        [Input("maxBackoff", json: true)]
        public Input<int>? MaxBackoff { get; set; }

        /// <summary>
        /// Minimum backoff period in seconds after failed API calls
        /// </summary>
        [Input("minBackoff", json: true)]
        public Input<int>? MinBackoff { get; set; }

        /// <summary>
        /// Maximum number of retries to perform when an API request fails
        /// </summary>
        [Input("retries", json: true)]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// RPS limit to apply when making calls to the API
        /// </summary>
        [Input("rps", json: true)]
        public Input<int>? Rps { get; set; }

        public ProviderArgs()
        {
            ApiClientLogging = Utilities.GetEnvBoolean("CLOUDFLARE_API_CLIENT_LOGGING") ?? false;
            MaxBackoff = Utilities.GetEnvInt32("CLOUDFLARE_MAX_BACKOFF") ?? 30;
            MinBackoff = Utilities.GetEnvInt32("CLOUDFLARE_MIN_BACKOFF") ?? 1;
            Retries = Utilities.GetEnvInt32("CLOUDFLARE_RETRIES") ?? 3;
            Rps = Utilities.GetEnvInt32("CLOUDFLARE_RPS") ?? 4;
        }
    }
}
