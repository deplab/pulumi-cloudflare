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
    /// Tunnel exposes applications running on your local web server on any
    /// network with an internet connection without manually adding DNS
    /// records or configuring a firewall or router.
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
    ///     var example = new Cloudflare.Tunnel("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "my-tunnel",
    ///         Secret = "AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/tunnel:Tunnel example &lt;account_id&gt;/&lt;tunnel_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/tunnel:Tunnel")]
    public partial class Tunnel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Usable CNAME for accessing the Tunnel.
        /// </summary>
        [Output("cname")]
        public Output<string> Cname { get; private set; } = null!;

        /// <summary>
        /// Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("configSrc")]
        public Output<string?> ConfigSrc { get; private set; } = null!;

        /// <summary>
        /// A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("secret")]
        public Output<string> Secret { get; private set; } = null!;

        /// <summary>
        /// Token used by a connector to authenticate and run the tunnel.
        /// </summary>
        [Output("tunnelToken")]
        public Output<string> TunnelToken { get; private set; } = null!;


        /// <summary>
        /// Create a Tunnel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tunnel(string name, TunnelArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/tunnel:Tunnel", name, args ?? new TunnelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tunnel(string name, Input<string> id, TunnelState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/tunnel:Tunnel", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secret",
                    "tunnelToken",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Tunnel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tunnel Get(string name, Input<string> id, TunnelState? state = null, CustomResourceOptions? options = null)
        {
            return new Tunnel(name, id, state, options);
        }
    }

    public sealed class TunnelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("configSrc")]
        public Input<string>? ConfigSrc { get; set; }

        /// <summary>
        /// A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("secret", required: true)]
        private Input<string>? _secret;

        /// <summary>
        /// 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public TunnelArgs()
        {
        }
        public static new TunnelArgs Empty => new TunnelArgs();
    }

    public sealed class TunnelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Usable CNAME for accessing the Tunnel.
        /// </summary>
        [Input("cname")]
        public Input<string>? Cname { get; set; }

        /// <summary>
        /// Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("configSrc")]
        public Input<string>? ConfigSrc { get; set; }

        /// <summary>
        /// A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tunnelToken")]
        private Input<string>? _tunnelToken;

        /// <summary>
        /// Token used by a connector to authenticate and run the tunnel.
        /// </summary>
        public Input<string>? TunnelToken
        {
            get => _tunnelToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tunnelToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public TunnelState()
        {
        }
        public static new TunnelState Empty => new TunnelState();
    }
}
