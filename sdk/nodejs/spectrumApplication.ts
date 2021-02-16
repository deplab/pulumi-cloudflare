// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Spectrum Application. You can extend the power of Cloudflare's DDoS, TLS, and IP Firewall to your other TCP-based services.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Define a spectrum application proxies ssh traffic
 * const sshProxy = new cloudflare.SpectrumApplication("sshProxy", {
 *     zoneId: _var.cloudflare_zone_id,
 *     protocol: "tcp/22",
 *     trafficType: "direct",
 *     dns: {
 *         type: "CNAME",
 *         name: "ssh.example.com",
 *     },
 *     originDirects: ["tcp://109.151.40.129:22"],
 * });
 * ```
 *
 * ## Import
 *
 * Spectrum resource can be imported using a zone ID and Application ID, e.g.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/spectrumApplication:SpectrumApplication example d41d8cd98f00b204e9800998ecf8427e/9a7806061c88ada191ed06f989cc3dac
 * ```
 *
 *  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones) * `9a7806061c88ada191ed06f989cc3dac` - Application ID
 */
export class SpectrumApplication extends pulumi.CustomResource {
    /**
     * Get an existing SpectrumApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpectrumApplicationState, opts?: pulumi.CustomResourceOptions): SpectrumApplication {
        return new SpectrumApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/spectrumApplication:SpectrumApplication';

    /**
     * Returns true if the given object is an instance of SpectrumApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SpectrumApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SpectrumApplication.__pulumiType;
    }

    /**
     * . Enables Argo Smart Routing. Defaults to `false`.
     */
    public readonly argoSmartRouting!: pulumi.Output<boolean | undefined>;
    /**
     * The name and type of DNS record for the Spectrum application. Fields documented below.
     */
    public readonly dns!: pulumi.Output<outputs.SpectrumApplicationDns>;
    /**
     * . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
     */
    public readonly edgeIpConnectivity!: pulumi.Output<string | undefined>;
    /**
     * . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     */
    public readonly edgeIps!: pulumi.Output<string[] | undefined>;
    /**
     * Enables the IP Firewall for this application. Defaults to `true`.
     */
    public readonly ipFirewall!: pulumi.Output<boolean | undefined>;
    /**
     * A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
     */
    public readonly originDirects!: pulumi.Output<string[] | undefined>;
    /**
     * A destination DNS addresses to the origin. Fields documented below.
     */
    public readonly originDns!: pulumi.Output<outputs.SpectrumApplicationOriginDns | undefined>;
    /**
     * If using `originDns` and not `originPortRange`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
     */
    public readonly originPort!: pulumi.Output<number | undefined>;
    /**
     * If using `originDns` and not `originPort`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
     */
    public readonly originPortRange!: pulumi.Output<outputs.SpectrumApplicationOriginPortRange | undefined>;
    /**
     * The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
     */
    public readonly proxyProtocol!: pulumi.Output<string | undefined>;
    /**
     * TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
     */
    public readonly tls!: pulumi.Output<string | undefined>;
    /**
     * Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
     */
    public readonly trafficType!: pulumi.Output<string | undefined>;
    /**
     * The DNS zone ID to add the application to
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a SpectrumApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpectrumApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpectrumApplicationArgs | SpectrumApplicationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpectrumApplicationState | undefined;
            inputs["argoSmartRouting"] = state ? state.argoSmartRouting : undefined;
            inputs["dns"] = state ? state.dns : undefined;
            inputs["edgeIpConnectivity"] = state ? state.edgeIpConnectivity : undefined;
            inputs["edgeIps"] = state ? state.edgeIps : undefined;
            inputs["ipFirewall"] = state ? state.ipFirewall : undefined;
            inputs["originDirects"] = state ? state.originDirects : undefined;
            inputs["originDns"] = state ? state.originDns : undefined;
            inputs["originPort"] = state ? state.originPort : undefined;
            inputs["originPortRange"] = state ? state.originPortRange : undefined;
            inputs["protocol"] = state ? state.protocol : undefined;
            inputs["proxyProtocol"] = state ? state.proxyProtocol : undefined;
            inputs["tls"] = state ? state.tls : undefined;
            inputs["trafficType"] = state ? state.trafficType : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as SpectrumApplicationArgs | undefined;
            if ((!args || args.dns === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dns'");
            }
            if ((!args || args.protocol === undefined) && !opts.urn) {
                throw new Error("Missing required property 'protocol'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["argoSmartRouting"] = args ? args.argoSmartRouting : undefined;
            inputs["dns"] = args ? args.dns : undefined;
            inputs["edgeIpConnectivity"] = args ? args.edgeIpConnectivity : undefined;
            inputs["edgeIps"] = args ? args.edgeIps : undefined;
            inputs["ipFirewall"] = args ? args.ipFirewall : undefined;
            inputs["originDirects"] = args ? args.originDirects : undefined;
            inputs["originDns"] = args ? args.originDns : undefined;
            inputs["originPort"] = args ? args.originPort : undefined;
            inputs["originPortRange"] = args ? args.originPortRange : undefined;
            inputs["protocol"] = args ? args.protocol : undefined;
            inputs["proxyProtocol"] = args ? args.proxyProtocol : undefined;
            inputs["tls"] = args ? args.tls : undefined;
            inputs["trafficType"] = args ? args.trafficType : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(SpectrumApplication.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpectrumApplication resources.
 */
export interface SpectrumApplicationState {
    /**
     * . Enables Argo Smart Routing. Defaults to `false`.
     */
    readonly argoSmartRouting?: pulumi.Input<boolean>;
    /**
     * The name and type of DNS record for the Spectrum application. Fields documented below.
     */
    readonly dns?: pulumi.Input<inputs.SpectrumApplicationDns>;
    /**
     * . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
     */
    readonly edgeIpConnectivity?: pulumi.Input<string>;
    /**
     * . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     */
    readonly edgeIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enables the IP Firewall for this application. Defaults to `true`.
     */
    readonly ipFirewall?: pulumi.Input<boolean>;
    /**
     * A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
     */
    readonly originDirects?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A destination DNS addresses to the origin. Fields documented below.
     */
    readonly originDns?: pulumi.Input<inputs.SpectrumApplicationOriginDns>;
    /**
     * If using `originDns` and not `originPortRange`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
     */
    readonly originPort?: pulumi.Input<number>;
    /**
     * If using `originDns` and not `originPort`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
     */
    readonly originPortRange?: pulumi.Input<inputs.SpectrumApplicationOriginPortRange>;
    /**
     * The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
     */
    readonly proxyProtocol?: pulumi.Input<string>;
    /**
     * TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
     */
    readonly tls?: pulumi.Input<string>;
    /**
     * Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
     */
    readonly trafficType?: pulumi.Input<string>;
    /**
     * The DNS zone ID to add the application to
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SpectrumApplication resource.
 */
export interface SpectrumApplicationArgs {
    /**
     * . Enables Argo Smart Routing. Defaults to `false`.
     */
    readonly argoSmartRouting?: pulumi.Input<boolean>;
    /**
     * The name and type of DNS record for the Spectrum application. Fields documented below.
     */
    readonly dns: pulumi.Input<inputs.SpectrumApplicationDns>;
    /**
     * . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
     */
    readonly edgeIpConnectivity?: pulumi.Input<string>;
    /**
     * . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
     */
    readonly edgeIps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Enables the IP Firewall for this application. Defaults to `true`.
     */
    readonly ipFirewall?: pulumi.Input<boolean>;
    /**
     * A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
     */
    readonly originDirects?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A destination DNS addresses to the origin. Fields documented below.
     */
    readonly originDns?: pulumi.Input<inputs.SpectrumApplicationOriginDns>;
    /**
     * If using `originDns` and not `originPortRange`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
     */
    readonly originPort?: pulumi.Input<number>;
    /**
     * If using `originDns` and not `originPort`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
     */
    readonly originPortRange?: pulumi.Input<inputs.SpectrumApplicationOriginPortRange>;
    /**
     * The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
     */
    readonly protocol: pulumi.Input<string>;
    /**
     * Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
     */
    readonly proxyProtocol?: pulumi.Input<string>;
    /**
     * TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
     */
    readonly tls?: pulumi.Input<string>;
    /**
     * Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
     */
    readonly trafficType?: pulumi.Input<string>;
    /**
     * The DNS zone ID to add the application to
     */
    readonly zoneId: pulumi.Input<string>;
}
