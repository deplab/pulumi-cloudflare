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
    /// Provides a resource, that manages Cloudflare tunnel routes for Zero Trust. Tunnel routes are used to direct IP traffic through Cloudflare Tunnels.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Tunnel route
    ///         var exampleTunnelRoute = new Cloudflare.TunnelRoute("exampleTunnelRoute", new Cloudflare.TunnelRouteArgs
    ///         {
    ///             AccountId = "c4a7362d577a6c3019a474fd6f485821",
    ///             TunnelId = "f70ff985-a4ef-4643-bbbc-4a0ed4fc8415",
    ///             Network = "192.0.2.24/32",
    ///             Comment = "New tunnel route for documentation",
    ///             VirtualNetworkId = "bdc39a3c-3104-4c23-8ac0-9f455dda691a",
    ///         });
    ///         // Tunnel with tunnel route
    ///         var tunnel = new Cloudflare.ArgoTunnel("tunnel", new Cloudflare.ArgoTunnelArgs
    ///         {
    ///             AccountId = "c4a7362d577a6c3019a474fd6f485821",
    ///             Name = "my_tunnel",
    ///             Secret = "AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=",
    ///         });
    ///         var exampleIndex_tunnelRouteTunnelRoute = new Cloudflare.TunnelRoute("exampleIndex/tunnelRouteTunnelRoute", new Cloudflare.TunnelRouteArgs
    ///         {
    ///             AccountId = "c4a7362d577a6c3019a474fd6f485821",
    ///             TunnelId = tunnel.Id,
    ///             Network = "192.0.2.24/32",
    ///             Comment = "New tunnel route for documentation",
    ///             VirtualNetworkId = "bdc39a3c-3104-4c23-8ac0-9f455dda691a",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// # Use account ID, network CIDR and virtual network ID.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/tunnelRoute:TunnelRoute cloudflare_tunnel_route &lt;account_id/&lt;network_cidr&gt;/&lt;virtual_network_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/tunnelRoute:TunnelRoute")]
    public partial class TunnelRoute : Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Description of the tunnel route.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
        /// </summary>
        [Output("network")]
        public Output<string> Network { get; private set; } = null!;

        /// <summary>
        /// The ID of the tunnel that will service the tunnel route.
        /// </summary>
        [Output("tunnelId")]
        public Output<string> TunnelId { get; private set; } = null!;

        /// <summary>
        /// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if
        /// none is provided.
        /// </summary>
        [Output("virtualNetworkId")]
        public Output<string?> VirtualNetworkId { get; private set; } = null!;


        /// <summary>
        /// Create a TunnelRoute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TunnelRoute(string name, TunnelRouteArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/tunnelRoute:TunnelRoute", name, args ?? new TunnelRouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TunnelRoute(string name, Input<string> id, TunnelRouteState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/tunnelRoute:TunnelRoute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TunnelRoute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TunnelRoute Get(string name, Input<string> id, TunnelRouteState? state = null, CustomResourceOptions? options = null)
        {
            return new TunnelRoute(name, id, state, options);
        }
    }

    public sealed class TunnelRouteArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Description of the tunnel route.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
        /// </summary>
        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        /// <summary>
        /// The ID of the tunnel that will service the tunnel route.
        /// </summary>
        [Input("tunnelId", required: true)]
        public Input<string> TunnelId { get; set; } = null!;

        /// <summary>
        /// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if
        /// none is provided.
        /// </summary>
        [Input("virtualNetworkId")]
        public Input<string>? VirtualNetworkId { get; set; }

        public TunnelRouteArgs()
        {
        }
    }

    public sealed class TunnelRouteState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Description of the tunnel route.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The IPv4 or IPv6 network that should use this tunnel route, in CIDR notation.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// The ID of the tunnel that will service the tunnel route.
        /// </summary>
        [Input("tunnelId")]
        public Input<string>? TunnelId { get; set; }

        /// <summary>
        /// The ID of the virtual network for which this route is being added; uses the default virtual network of the account if
        /// none is provided.
        /// </summary>
        [Input("virtualNetworkId")]
        public Input<string>? VirtualNetworkId { get; set; }

        public TunnelRouteState()
        {
        }
    }
}
