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
    /// Provides a Cloudflare Teams Location resource. Teams Locations are
    /// referenced when creating secure web gateway policies.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.TeamsLocation("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         ClientDefault = true,
    ///         Name = "office",
    ///         Networks = new[]
    ///         {
    ///             new Cloudflare.Inputs.TeamsLocationNetworkArgs
    ///             {
    ///                 Network = "203.0.113.1/32",
    ///             },
    ///             new Cloudflare.Inputs.TeamsLocationNetworkArgs
    ///             {
    ///                 Network = "203.0.113.2/32",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/teamsLocation:TeamsLocation example &lt;account_id&gt;/&lt;teams_location_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/teamsLocation:TeamsLocation")]
    public partial class TeamsLocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Indicator that anonymized logs are enabled.
        /// </summary>
        [Output("anonymizedLogsEnabled")]
        public Output<bool> AnonymizedLogsEnabled { get; private set; } = null!;

        /// <summary>
        /// Indicator that this is the default location.
        /// </summary>
        [Output("clientDefault")]
        public Output<bool?> ClientDefault { get; private set; } = null!;

        /// <summary>
        /// The FQDN that DoH clients should be pointed at.
        /// </summary>
        [Output("dohSubdomain")]
        public Output<string> DohSubdomain { get; private set; } = null!;

        /// <summary>
        /// Client IP address.
        /// </summary>
        [Output("ip")]
        public Output<string> Ip { get; private set; } = null!;

        /// <summary>
        /// IP to direct all IPv4 DNS queries to.
        /// </summary>
        [Output("ipv4Destination")]
        public Output<string> Ipv4Destination { get; private set; } = null!;

        /// <summary>
        /// Name of the teams location.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The networks CIDRs that comprise the location.
        /// </summary>
        [Output("networks")]
        public Output<ImmutableArray<Outputs.TeamsLocationNetwork>> Networks { get; private set; } = null!;

        [Output("policyIds")]
        public Output<ImmutableArray<string>> PolicyIds { get; private set; } = null!;


        /// <summary>
        /// Create a TeamsLocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TeamsLocation(string name, TeamsLocationArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/teamsLocation:TeamsLocation", name, args ?? new TeamsLocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TeamsLocation(string name, Input<string> id, TeamsLocationState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/teamsLocation:TeamsLocation", name, state, MakeResourceOptions(options, id))
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
        /// <summary>
        /// Get an existing TeamsLocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TeamsLocation Get(string name, Input<string> id, TeamsLocationState? state = null, CustomResourceOptions? options = null)
        {
            return new TeamsLocation(name, id, state, options);
        }
    }

    public sealed class TeamsLocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Indicator that this is the default location.
        /// </summary>
        [Input("clientDefault")]
        public Input<bool>? ClientDefault { get; set; }

        /// <summary>
        /// Name of the teams location.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("networks")]
        private InputList<Inputs.TeamsLocationNetworkArgs>? _networks;

        /// <summary>
        /// The networks CIDRs that comprise the location.
        /// </summary>
        public InputList<Inputs.TeamsLocationNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.TeamsLocationNetworkArgs>());
            set => _networks = value;
        }

        public TeamsLocationArgs()
        {
        }
        public static new TeamsLocationArgs Empty => new TeamsLocationArgs();
    }

    public sealed class TeamsLocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Indicator that anonymized logs are enabled.
        /// </summary>
        [Input("anonymizedLogsEnabled")]
        public Input<bool>? AnonymizedLogsEnabled { get; set; }

        /// <summary>
        /// Indicator that this is the default location.
        /// </summary>
        [Input("clientDefault")]
        public Input<bool>? ClientDefault { get; set; }

        /// <summary>
        /// The FQDN that DoH clients should be pointed at.
        /// </summary>
        [Input("dohSubdomain")]
        public Input<string>? DohSubdomain { get; set; }

        /// <summary>
        /// Client IP address.
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// IP to direct all IPv4 DNS queries to.
        /// </summary>
        [Input("ipv4Destination")]
        public Input<string>? Ipv4Destination { get; set; }

        /// <summary>
        /// Name of the teams location.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.TeamsLocationNetworkGetArgs>? _networks;

        /// <summary>
        /// The networks CIDRs that comprise the location.
        /// </summary>
        public InputList<Inputs.TeamsLocationNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.TeamsLocationNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("policyIds")]
        private InputList<string>? _policyIds;
        public InputList<string> PolicyIds
        {
            get => _policyIds ?? (_policyIds = new InputList<string>());
            set => _policyIds = value;
        }

        public TeamsLocationState()
        {
        }
        public static new TeamsLocationState Empty => new TeamsLocationState();
    }
}
