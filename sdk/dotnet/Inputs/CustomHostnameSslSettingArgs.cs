// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class CustomHostnameSslSettingArgs : Pulumi.ResourceArgs
    {
        [Input("ciphers")]
        private InputList<string>? _ciphers;

        /// <summary>
        /// List of SSL/TLS ciphers to associate with this certificate.
        /// </summary>
        public InputList<string> Ciphers
        {
            get => _ciphers ?? (_ciphers = new InputList<string>());
            set => _ciphers = value;
        }

        /// <summary>
        /// Whether or not HTTP2 should be supported. Valid values are `"on"` or `"off"`.
        /// </summary>
        [Input("http2")]
        public Input<string>? Http2 { get; set; }

        /// <summary>
        /// Lowest version of TLS this certificate should
        /// support. Valid values are `"1.0"`, `"1.1"`, `"1.2"` and `"1.3"`.
        /// </summary>
        [Input("minTlsVersion")]
        public Input<string>? MinTlsVersion { get; set; }

        /// <summary>
        /// Whether or not TLSv1.3 should be supported. Valid values are `"on"` or `"off"`.
        /// </summary>
        [Input("tls13")]
        public Input<string>? Tls13 { get; set; }

        public CustomHostnameSslSettingArgs()
        {
        }
    }
}
