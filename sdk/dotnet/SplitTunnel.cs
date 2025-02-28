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
    /// Provides a Cloudflare Split Tunnel resource. Split tunnels are used to either
    /// include or exclude lists of routes from the WARP client's tunnel.
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
    ///     // Excluding *.example.com from WARP routes
    ///     var exampleSplitTunnelExclude = new Cloudflare.SplitTunnel("exampleSplitTunnelExclude", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Mode = "exclude",
    ///         Tunnels = new[]
    ///         {
    ///             new Cloudflare.Inputs.SplitTunnelTunnelArgs
    ///             {
    ///                 Host = "*.example.com",
    ///                 Description = "example domain",
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Including *.example.com in WARP routes
    ///     var exampleSplitTunnelIncludeSplitTunnel = new Cloudflare.SplitTunnel("exampleSplitTunnelIncludeSplitTunnel", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Mode = "include",
    ///         Tunnels = new[]
    ///         {
    ///             new Cloudflare.Inputs.SplitTunnelTunnelArgs
    ///             {
    ///                 Host = "*.example.com",
    ///                 Description = "example domain",
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Create a device policy
    ///     var developerWarpPolicy = new Cloudflare.DeviceSettingsPolicy("developerWarpPolicy", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "Developers",
    ///         Precedence = 10,
    ///         Match = "any(identity.groups.name[*] in {\"Developers\"})",
    ///         SwitchLocked = true,
    ///     });
    /// 
    ///     // Excluding *.example.com from WARP routes for a particular device policy
    ///     var exampleDeviceSettingsPolicySplitTunnelExclude = new Cloudflare.SplitTunnel("exampleDeviceSettingsPolicySplitTunnelExclude", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         PolicyId = developerWarpPolicy.Id,
    ///         Mode = "exclude",
    ///         Tunnels = new[]
    ///         {
    ///             new Cloudflare.Inputs.SplitTunnelTunnelArgs
    ///             {
    ///                 Host = "*.example.com",
    ///                 Description = "example domain",
    ///             },
    ///         },
    ///     });
    /// 
    ///     // Including *.example.com in WARP routes for a particular device policy
    ///     var exampleSplitTunnelIncludeIndex_splitTunnelSplitTunnel = new Cloudflare.SplitTunnel("exampleSplitTunnelIncludeIndex/splitTunnelSplitTunnel", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         PolicyId = cloudflare_device_policy.Developer_warp_policy.Id,
    ///         Mode = "include",
    ///         Tunnels = new[]
    ///         {
    ///             new Cloudflare.Inputs.SplitTunnelTunnelArgs
    ///             {
    ///                 Host = "*.example.com",
    ///                 Description = "example domain",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Split Tunnels for default device policies must use "default" as the policy ID.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/splitTunnel:SplitTunnel example &lt;account_id&gt;/&lt;policy_id&gt;/&lt;mode&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/splitTunnel:SplitTunnel")]
    public partial class SplitTunnel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The mode of the split tunnel policy. Available values: `include`, `exclude`.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The settings policy for which to configure this split tunnel policy.
        /// </summary>
        [Output("policyId")]
        public Output<string?> PolicyId { get; private set; } = null!;

        /// <summary>
        /// The value of the tunnel attributes.
        /// </summary>
        [Output("tunnels")]
        public Output<ImmutableArray<Outputs.SplitTunnelTunnel>> Tunnels { get; private set; } = null!;


        /// <summary>
        /// Create a SplitTunnel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SplitTunnel(string name, SplitTunnelArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/splitTunnel:SplitTunnel", name, args ?? new SplitTunnelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SplitTunnel(string name, Input<string> id, SplitTunnelState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/splitTunnel:SplitTunnel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SplitTunnel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SplitTunnel Get(string name, Input<string> id, SplitTunnelState? state = null, CustomResourceOptions? options = null)
        {
            return new SplitTunnel(name, id, state, options);
        }
    }

    public sealed class SplitTunnelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The mode of the split tunnel policy. Available values: `include`, `exclude`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// The settings policy for which to configure this split tunnel policy.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        [Input("tunnels", required: true)]
        private InputList<Inputs.SplitTunnelTunnelArgs>? _tunnels;

        /// <summary>
        /// The value of the tunnel attributes.
        /// </summary>
        public InputList<Inputs.SplitTunnelTunnelArgs> Tunnels
        {
            get => _tunnels ?? (_tunnels = new InputList<Inputs.SplitTunnelTunnelArgs>());
            set => _tunnels = value;
        }

        public SplitTunnelArgs()
        {
        }
        public static new SplitTunnelArgs Empty => new SplitTunnelArgs();
    }

    public sealed class SplitTunnelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The mode of the split tunnel policy. Available values: `include`, `exclude`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The settings policy for which to configure this split tunnel policy.
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        [Input("tunnels")]
        private InputList<Inputs.SplitTunnelTunnelGetArgs>? _tunnels;

        /// <summary>
        /// The value of the tunnel attributes.
        /// </summary>
        public InputList<Inputs.SplitTunnelTunnelGetArgs> Tunnels
        {
            get => _tunnels ?? (_tunnels = new InputList<Inputs.SplitTunnelTunnelGetArgs>());
            set => _tunnels = value;
        }

        public SplitTunnelState()
        {
        }
        public static new SplitTunnelState Empty => new SplitTunnelState();
    }
}
