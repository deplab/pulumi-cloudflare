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
    /// Provides a Cloudflare per-hostname TLS setting resource, specifically for ciphers suites. Used to set ciphers suites for hostnames under the specified zone.
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
    ///     var example = new Cloudflare.HostnameTlsSettingCiphers("example", new()
    ///     {
    ///         Hostname = "sub.example.com",
    ///         Values = new[]
    ///         {
    ///             "ECDHE-RSA-AES128-GCM-SHA256",
    ///         },
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers example &lt;zone_id&gt;/&lt;hostname&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers")]
    public partial class HostnameTlsSettingCiphers : global::Pulumi.CustomResource
    {
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// Ports to use within the IP rule.
        /// </summary>
        [Output("ports")]
        public Output<ImmutableArray<int>> Ports { get; private set; } = null!;

        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// Ciphers suites value.
        /// </summary>
        [Output("values")]
        public Output<ImmutableArray<string>> Values { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a HostnameTlsSettingCiphers resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HostnameTlsSettingCiphers(string name, HostnameTlsSettingCiphersArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers", name, args ?? new HostnameTlsSettingCiphersArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HostnameTlsSettingCiphers(string name, Input<string> id, HostnameTlsSettingCiphersState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HostnameTlsSettingCiphers resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HostnameTlsSettingCiphers Get(string name, Input<string> id, HostnameTlsSettingCiphersState? state = null, CustomResourceOptions? options = null)
        {
            return new HostnameTlsSettingCiphers(name, id, state, options);
        }
    }

    public sealed class HostnameTlsSettingCiphersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        [Input("ports")]
        private InputList<int>? _ports;

        /// <summary>
        /// Ports to use within the IP rule.
        /// </summary>
        public InputList<int> Ports
        {
            get => _ports ?? (_ports = new InputList<int>());
            set => _ports = value;
        }

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// Ciphers suites value.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public HostnameTlsSettingCiphersArgs()
        {
        }
        public static new HostnameTlsSettingCiphersArgs Empty => new HostnameTlsSettingCiphersArgs();
    }

    public sealed class HostnameTlsSettingCiphersState : global::Pulumi.ResourceArgs
    {
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        [Input("ports")]
        private InputList<int>? _ports;

        /// <summary>
        /// Ports to use within the IP rule.
        /// </summary>
        public InputList<int> Ports
        {
            get => _ports ?? (_ports = new InputList<int>());
            set => _ports = value;
        }

        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// Ciphers suites value.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public HostnameTlsSettingCiphersState()
        {
        }
        public static new HostnameTlsSettingCiphersState Empty => new HostnameTlsSettingCiphersState();
    }
}
