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
    /// Argo Tunnel exposes applications running on your local web server on any network with an internet connection without manually adding DNS records or configuring a firewall or router.
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
    ///         var example = new Cloudflare.ArgoTunnel("example", new Cloudflare.ArgoTunnelArgs
    ///         {
    ///             AccountId = "d41d8cd98f00b204e9800998ecf8427e",
    ///             Name = "my-tunnel",
    ///             Secret = "AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Argo Tunnels can be imported a composite ID of the account ID and tunnel UUID.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/argoTunnel:ArgoTunnel example d41d8cd98f00b204e9800998ecf8427e/fd2455cb-5fcc-4c13-8738-8d8d2605237f
    /// ```
    /// 
    ///  where - `d41d8cd98f00b204e9800998ecf8427e` is the account ID - `fd2455cb-5fcc-4c13-8738-8d8d2605237f` is the Argo Tunnel UUID
    /// </summary>
    [CloudflareResourceType("cloudflare:index/argoTunnel:ArgoTunnel")]
    public partial class ArgoTunnel : Pulumi.CustomResource
    {
        /// <summary>
        /// The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// A user-friendly name chosen when the tunnel is created. Cannot be empty.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        /// </summary>
        [Output("secret")]
        public Output<string> Secret { get; private set; } = null!;


        /// <summary>
        /// Create a ArgoTunnel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ArgoTunnel(string name, ArgoTunnelArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/argoTunnel:ArgoTunnel", name, args ?? new ArgoTunnelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ArgoTunnel(string name, Input<string> id, ArgoTunnelState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/argoTunnel:ArgoTunnel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ArgoTunnel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ArgoTunnel Get(string name, Input<string> id, ArgoTunnelState? state = null, CustomResourceOptions? options = null)
        {
            return new ArgoTunnel(name, id, state, options);
        }
    }

    public sealed class ArgoTunnelArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// A user-friendly name chosen when the tunnel is created. Cannot be empty.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        /// </summary>
        [Input("secret", required: true)]
        public Input<string> Secret { get; set; } = null!;

        public ArgoTunnelArgs()
        {
        }
    }

    public sealed class ArgoTunnelState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Cloudflare account ID that you wish to manage the Argo Tunnel on.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// A user-friendly name chosen when the tunnel is created. Cannot be empty.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password.
        /// </summary>
        [Input("secret")]
        public Input<string>? Secret { get; set; }

        public ArgoTunnelState()
        {
        }
    }
}