// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetZones
    {
        /// <summary>
        /// Use this data source to look up Zone results for use in other resources.
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
        ///     var example = Cloudflare.GetZones.Invoke(new()
        ///     {
        ///         Filter = new Cloudflare.Inputs.GetZonesFilterInputArgs
        ///         {
        ///             AccountId = "f037e56e89293a057740de681ac9abbe",
        ///             Status = "active",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetZonesResult> InvokeAsync(GetZonesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZonesResult>("cloudflare:index/getZones:getZones", args ?? new GetZonesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to look up Zone results for use in other resources.
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
        ///     var example = Cloudflare.GetZones.Invoke(new()
        ///     {
        ///         Filter = new Cloudflare.Inputs.GetZonesFilterInputArgs
        ///         {
        ///             AccountId = "f037e56e89293a057740de681ac9abbe",
        ///             Status = "active",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetZonesResult> Invoke(GetZonesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZonesResult>("cloudflare:index/getZones:getZones", args ?? new GetZonesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZonesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
        /// </summary>
        [Input("filter", required: true)]
        public Inputs.GetZonesFilterArgs Filter { get; set; } = null!;

        public GetZonesArgs()
        {
        }
        public static new GetZonesArgs Empty => new GetZonesArgs();
    }

    public sealed class GetZonesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
        /// </summary>
        [Input("filter", required: true)]
        public Input<Inputs.GetZonesFilterInputArgs> Filter { get; set; } = null!;

        public GetZonesInvokeArgs()
        {
        }
        public static new GetZonesInvokeArgs Empty => new GetZonesInvokeArgs();
    }


    [OutputType]
    public sealed class GetZonesResult
    {
        /// <summary>
        /// One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
        /// </summary>
        public readonly Outputs.GetZonesFilterResult Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of zone objects.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZonesZoneResult> Zones;

        [OutputConstructor]
        private GetZonesResult(
            Outputs.GetZonesFilterResult filter,

            string id,

            ImmutableArray<Outputs.GetZonesZoneResult> zones)
        {
            Filter = filter;
            Id = id;
            Zones = zones;
        }
    }
}
