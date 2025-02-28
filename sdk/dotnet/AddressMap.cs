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
    /// Provides the ability to manage IP addresses that can be used by DNS records when
    /// they are proxied through Cloudflare.
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
    ///     var example = new Cloudflare.AddressMap("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         DefaultSni = "*.example.com",
    ///         Description = "My address map",
    ///         Enabled = true,
    ///         Ips = new[]
    ///         {
    ///             new Cloudflare.Inputs.AddressMapIpArgs
    ///             {
    ///                 Ip = "192.0.2.1",
    ///             },
    ///             new Cloudflare.Inputs.AddressMapIpArgs
    ///             {
    ///                 Ip = "203.0.113.1",
    ///             },
    ///         },
    ///         Memberships = new[]
    ///         {
    ///             new Cloudflare.Inputs.AddressMapMembershipArgs
    ///             {
    ///                 Identifier = "92f17202ed8bd63d69a66b86a49a8f6b",
    ///                 Kind = "account",
    ///             },
    ///             new Cloudflare.Inputs.AddressMapMembershipArgs
    ///             {
    ///                 Identifier = "023e105f4ecef8ad9ca31a8372d0c353",
    ///                 Kind = "zone",
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
    ///  $ pulumi import cloudflare:index/addressMap:AddressMap example &lt;account_id&gt;/&lt;address_map_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/addressMap:AddressMap")]
    public partial class AddressMap : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Controls whether the membership can be deleted via the API or not.
        /// </summary>
        [Output("canDelete")]
        public Output<bool> CanDelete { get; private set; } = null!;

        /// <summary>
        /// If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
        /// </summary>
        [Output("canModifyIps")]
        public Output<bool> CanModifyIps { get; private set; } = null!;

        /// <summary>
        /// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        /// </summary>
        [Output("defaultSni")]
        public Output<string?> DefaultSni { get; private set; } = null!;

        /// <summary>
        /// Description of the address map.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether the Address Map is enabled or not.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// The set of IPs on the Address Map.
        /// </summary>
        [Output("ips")]
        public Output<ImmutableArray<Outputs.AddressMapIp>> Ips { get; private set; } = null!;

        /// <summary>
        /// Zones and Accounts which will be assigned IPs on this Address Map.
        /// </summary>
        [Output("memberships")]
        public Output<ImmutableArray<Outputs.AddressMapMembership>> Memberships { get; private set; } = null!;


        /// <summary>
        /// Create a AddressMap resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AddressMap(string name, AddressMapArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/addressMap:AddressMap", name, args ?? new AddressMapArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AddressMap(string name, Input<string> id, AddressMapState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/addressMap:AddressMap", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AddressMap resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AddressMap Get(string name, Input<string> id, AddressMapState? state = null, CustomResourceOptions? options = null)
        {
            return new AddressMap(name, id, state, options);
        }
    }

    public sealed class AddressMapArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        /// </summary>
        [Input("defaultSni")]
        public Input<string>? DefaultSni { get; set; }

        /// <summary>
        /// Description of the address map.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the Address Map is enabled or not.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("ips")]
        private InputList<Inputs.AddressMapIpArgs>? _ips;

        /// <summary>
        /// The set of IPs on the Address Map.
        /// </summary>
        public InputList<Inputs.AddressMapIpArgs> Ips
        {
            get => _ips ?? (_ips = new InputList<Inputs.AddressMapIpArgs>());
            set => _ips = value;
        }

        [Input("memberships")]
        private InputList<Inputs.AddressMapMembershipArgs>? _memberships;

        /// <summary>
        /// Zones and Accounts which will be assigned IPs on this Address Map.
        /// </summary>
        public InputList<Inputs.AddressMapMembershipArgs> Memberships
        {
            get => _memberships ?? (_memberships = new InputList<Inputs.AddressMapMembershipArgs>());
            set => _memberships = value;
        }

        public AddressMapArgs()
        {
        }
        public static new AddressMapArgs Empty => new AddressMapArgs();
    }

    public sealed class AddressMapState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Controls whether the membership can be deleted via the API or not.
        /// </summary>
        [Input("canDelete")]
        public Input<bool>? CanDelete { get; set; }

        /// <summary>
        /// If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
        /// </summary>
        [Input("canModifyIps")]
        public Input<bool>? CanModifyIps { get; set; }

        /// <summary>
        /// If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
        /// </summary>
        [Input("defaultSni")]
        public Input<string>? DefaultSni { get; set; }

        /// <summary>
        /// Description of the address map.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether the Address Map is enabled or not.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("ips")]
        private InputList<Inputs.AddressMapIpGetArgs>? _ips;

        /// <summary>
        /// The set of IPs on the Address Map.
        /// </summary>
        public InputList<Inputs.AddressMapIpGetArgs> Ips
        {
            get => _ips ?? (_ips = new InputList<Inputs.AddressMapIpGetArgs>());
            set => _ips = value;
        }

        [Input("memberships")]
        private InputList<Inputs.AddressMapMembershipGetArgs>? _memberships;

        /// <summary>
        /// Zones and Accounts which will be assigned IPs on this Address Map.
        /// </summary>
        public InputList<Inputs.AddressMapMembershipGetArgs> Memberships
        {
            get => _memberships ?? (_memberships = new InputList<Inputs.AddressMapMembershipGetArgs>());
            set => _memberships = value;
        }

        public AddressMapState()
        {
        }
        public static new AddressMapState Empty => new AddressMapState();
    }
}
