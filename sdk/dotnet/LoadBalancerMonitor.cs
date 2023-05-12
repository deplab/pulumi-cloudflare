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
    /// If Cloudflare's Load Balancing to load-balance across multiple
    /// origin servers or data centers, you configure one of these Monitors
    /// to actively check the availability of those servers over HTTP(S) or
    /// TCP.
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
    ///     // TCP Monitor
    ///     var example = new Cloudflare.LoadBalancerMonitor("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Description = "example tcp load balancer",
    ///         Interval = 60,
    ///         Method = "connection_established",
    ///         Port = 8080,
    ///         Retries = 5,
    ///         Timeout = 7,
    ///         Type = "tcp",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor")]
    public partial class LoadBalancerMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
        /// </summary>
        [Output("allowInsecure")]
        public Output<bool?> AllowInsecure { get; private set; } = null!;

        /// <summary>
        /// The RFC3339 timestamp of when the load balancer monitor was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Free text description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
        /// </summary>
        [Output("expectedBody")]
        public Output<string?> ExpectedBody { get; private set; } = null!;

        /// <summary>
        /// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
        /// </summary>
        [Output("expectedCodes")]
        public Output<string?> ExpectedCodes { get; private set; } = null!;

        /// <summary>
        /// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
        /// </summary>
        [Output("followRedirects")]
        public Output<bool?> FollowRedirects { get; private set; } = null!;

        /// <summary>
        /// The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
        /// </summary>
        [Output("headers")]
        public Output<ImmutableArray<Outputs.LoadBalancerMonitorHeader>> Headers { get; private set; } = null!;

        /// <summary>
        /// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
        /// </summary>
        [Output("interval")]
        public Output<int?> Interval { get; private set; } = null!;

        /// <summary>
        /// The method to use for the health check.
        /// </summary>
        [Output("method")]
        public Output<string> Method { get; private set; } = null!;

        /// <summary>
        /// The RFC3339 timestamp of when the load balancer monitor was last modified.
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// The endpoint path to health check against.
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

        /// <summary>
        /// The port number to use for the healthcheck, required when creating a TCP monitor.
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
        /// </summary>
        [Output("probeZone")]
        public Output<string?> ProbeZone { get; private set; } = null!;

        /// <summary>
        /// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
        /// </summary>
        [Output("retries")]
        public Output<int?> Retries { get; private set; } = null!;

        /// <summary>
        /// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
        /// </summary>
        [Output("timeout")]
        public Output<int?> Timeout { get; private set; } = null!;

        /// <summary>
        /// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a LoadBalancerMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LoadBalancerMonitor(string name, LoadBalancerMonitorArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor", name, args ?? new LoadBalancerMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LoadBalancerMonitor(string name, Input<string> id, LoadBalancerMonitorState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LoadBalancerMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LoadBalancerMonitor Get(string name, Input<string> id, LoadBalancerMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new LoadBalancerMonitor(name, id, state, options);
        }
    }

    public sealed class LoadBalancerMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
        /// </summary>
        [Input("allowInsecure")]
        public Input<bool>? AllowInsecure { get; set; }

        /// <summary>
        /// Free text description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
        /// </summary>
        [Input("expectedBody")]
        public Input<string>? ExpectedBody { get; set; }

        /// <summary>
        /// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
        /// </summary>
        [Input("expectedCodes")]
        public Input<string>? ExpectedCodes { get; set; }

        /// <summary>
        /// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
        /// </summary>
        [Input("followRedirects")]
        public Input<bool>? FollowRedirects { get; set; }

        [Input("headers")]
        private InputList<Inputs.LoadBalancerMonitorHeaderArgs>? _headers;

        /// <summary>
        /// The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
        /// </summary>
        public InputList<Inputs.LoadBalancerMonitorHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.LoadBalancerMonitorHeaderArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// The method to use for the health check.
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// The endpoint path to health check against.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The port number to use for the healthcheck, required when creating a TCP monitor.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
        /// </summary>
        [Input("probeZone")]
        public Input<string>? ProbeZone { get; set; }

        /// <summary>
        /// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
        /// </summary>
        [Input("retries")]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public LoadBalancerMonitorArgs()
        {
        }
        public static new LoadBalancerMonitorArgs Empty => new LoadBalancerMonitorArgs();
    }

    public sealed class LoadBalancerMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
        /// </summary>
        [Input("allowInsecure")]
        public Input<bool>? AllowInsecure { get; set; }

        /// <summary>
        /// The RFC3339 timestamp of when the load balancer monitor was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Free text description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
        /// </summary>
        [Input("expectedBody")]
        public Input<string>? ExpectedBody { get; set; }

        /// <summary>
        /// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
        /// </summary>
        [Input("expectedCodes")]
        public Input<string>? ExpectedCodes { get; set; }

        /// <summary>
        /// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
        /// </summary>
        [Input("followRedirects")]
        public Input<bool>? FollowRedirects { get; set; }

        [Input("headers")]
        private InputList<Inputs.LoadBalancerMonitorHeaderGetArgs>? _headers;

        /// <summary>
        /// The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
        /// </summary>
        public InputList<Inputs.LoadBalancerMonitorHeaderGetArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.LoadBalancerMonitorHeaderGetArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// The method to use for the health check.
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// The RFC3339 timestamp of when the load balancer monitor was last modified.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// The endpoint path to health check against.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The port number to use for the healthcheck, required when creating a TCP monitor.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
        /// </summary>
        [Input("probeZone")]
        public Input<string>? ProbeZone { get; set; }

        /// <summary>
        /// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
        /// </summary>
        [Input("retries")]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
        /// </summary>
        [Input("timeout")]
        public Input<int>? Timeout { get; set; }

        /// <summary>
        /// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public LoadBalancerMonitorState()
        {
        }
        public static new LoadBalancerMonitorState Empty => new LoadBalancerMonitorState();
    }
}
