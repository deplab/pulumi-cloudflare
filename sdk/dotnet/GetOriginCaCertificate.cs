// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetOriginCaCertificate
    {
        /// <summary>
        /// Use this data source to retrieve an existing origin ca certificate.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetOriginCaCertificate.Invoke(new()
        ///     {
        ///         Id = "REPLACE_ME",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetOriginCaCertificateResult> InvokeAsync(GetOriginCaCertificateArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOriginCaCertificateResult>("cloudflare:index/getOriginCaCertificate:getOriginCaCertificate", args ?? new GetOriginCaCertificateArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve an existing origin ca certificate.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetOriginCaCertificate.Invoke(new()
        ///     {
        ///         Id = "REPLACE_ME",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetOriginCaCertificateResult> Invoke(GetOriginCaCertificateInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOriginCaCertificateResult>("cloudflare:index/getOriginCaCertificate:getOriginCaCertificate", args ?? new GetOriginCaCertificateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOriginCaCertificateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Origin CA Certificate unique identifier.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetOriginCaCertificateArgs()
        {
        }
        public static new GetOriginCaCertificateArgs Empty => new GetOriginCaCertificateArgs();
    }

    public sealed class GetOriginCaCertificateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Origin CA Certificate unique identifier.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetOriginCaCertificateInvokeArgs()
        {
        }
        public static new GetOriginCaCertificateInvokeArgs Empty => new GetOriginCaCertificateInvokeArgs();
    }


    [OutputType]
    public sealed class GetOriginCaCertificateResult
    {
        /// <summary>
        /// The Origin CA certificate.
        /// </summary>
        public readonly string Certificate;
        /// <summary>
        /// The timestamp when the certificate will expire.
        /// </summary>
        public readonly string ExpiresOn;
        /// <summary>
        /// A list of hostnames or wildcard names bound to the certificate.
        /// </summary>
        public readonly ImmutableArray<string> Hostnames;
        /// <summary>
        /// The Origin CA Certificate unique identifier.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`
        /// </summary>
        public readonly string RequestType;
        /// <summary>
        /// The timestamp when the certificate was revoked.
        /// </summary>
        public readonly string RevokedAt;

        [OutputConstructor]
        private GetOriginCaCertificateResult(
            string certificate,

            string expiresOn,

            ImmutableArray<string> hostnames,

            string id,

            string requestType,

            string revokedAt)
        {
            Certificate = certificate;
            ExpiresOn = expiresOn;
            Hostnames = hostnames;
            Id = id;
            RequestType = requestType;
            RevokedAt = revokedAt;
        }
    }
}
