// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Teams Account resource. The Teams Account
 * resource defines configuration for secure web gateway.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.TeamsAccount("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     antivirus: {
 *         enabledDownloadPhase: true,
 *         enabledUploadPhase: false,
 *         failClosed: true,
 *     },
 *     blockPage: {
 *         backgroundColor: "#000000",
 *         footerText: "hello",
 *         headerText: "hello",
 *         logoPath: "https://example.com/logo.jpg",
 *     },
 *     fips: {
 *         tls: true,
 *     },
 *     logging: {
 *         redactPii: true,
 *         settingsByRuleType: {
 *             dns: {
 *                 logAll: false,
 *                 logBlocks: true,
 *             },
 *             http: {
 *                 logAll: true,
 *                 logBlocks: true,
 *             },
 *             l4: {
 *                 logAll: false,
 *                 logBlocks: true,
 *             },
 *         },
 *     },
 *     proxy: {
 *         tcp: true,
 *         udp: true,
 *     },
 *     tlsDecryptEnabled: true,
 *     urlBrowserIsolationEnabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/teamsAccount:TeamsAccount example <account_id>
 * ```
 */
export class TeamsAccount extends pulumi.CustomResource {
    /**
     * Get an existing TeamsAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamsAccountState, opts?: pulumi.CustomResourceOptions): TeamsAccount {
        return new TeamsAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/teamsAccount:TeamsAccount';

    /**
     * Returns true if the given object is an instance of TeamsAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeamsAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeamsAccount.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Whether to enable the activity log.
     */
    public readonly activityLogEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Configuration block for antivirus traffic scanning.
     */
    public readonly antivirus!: pulumi.Output<outputs.TeamsAccountAntivirus | undefined>;
    /**
     * Configuration for a custom block page.
     */
    public readonly blockPage!: pulumi.Output<outputs.TeamsAccountBlockPage | undefined>;
    /**
     * Configure compliance with Federal Information Processing Standards.
     */
    public readonly fips!: pulumi.Output<outputs.TeamsAccountFips | undefined>;
    public readonly logging!: pulumi.Output<outputs.TeamsAccountLogging | undefined>;
    /**
     * Configuration for DLP Payload Logging.
     */
    public readonly payloadLog!: pulumi.Output<outputs.TeamsAccountPayloadLog | undefined>;
    /**
     * Configuration block for specifying which protocols are proxied.
     */
    public readonly proxy!: pulumi.Output<outputs.TeamsAccountProxy | undefined>;
    /**
     * Indicator that decryption of TLS traffic is enabled.
     */
    public readonly tlsDecryptEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Safely browse websites in Browser Isolation through a URL.
     */
    public readonly urlBrowserIsolationEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a TeamsAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamsAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamsAccountArgs | TeamsAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamsAccountState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["activityLogEnabled"] = state ? state.activityLogEnabled : undefined;
            resourceInputs["antivirus"] = state ? state.antivirus : undefined;
            resourceInputs["blockPage"] = state ? state.blockPage : undefined;
            resourceInputs["fips"] = state ? state.fips : undefined;
            resourceInputs["logging"] = state ? state.logging : undefined;
            resourceInputs["payloadLog"] = state ? state.payloadLog : undefined;
            resourceInputs["proxy"] = state ? state.proxy : undefined;
            resourceInputs["tlsDecryptEnabled"] = state ? state.tlsDecryptEnabled : undefined;
            resourceInputs["urlBrowserIsolationEnabled"] = state ? state.urlBrowserIsolationEnabled : undefined;
        } else {
            const args = argsOrState as TeamsAccountArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["activityLogEnabled"] = args ? args.activityLogEnabled : undefined;
            resourceInputs["antivirus"] = args ? args.antivirus : undefined;
            resourceInputs["blockPage"] = args ? args.blockPage : undefined;
            resourceInputs["fips"] = args ? args.fips : undefined;
            resourceInputs["logging"] = args ? args.logging : undefined;
            resourceInputs["payloadLog"] = args ? args.payloadLog : undefined;
            resourceInputs["proxy"] = args ? args.proxy : undefined;
            resourceInputs["tlsDecryptEnabled"] = args ? args.tlsDecryptEnabled : undefined;
            resourceInputs["urlBrowserIsolationEnabled"] = args ? args.urlBrowserIsolationEnabled : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TeamsAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamsAccount resources.
 */
export interface TeamsAccountState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Whether to enable the activity log.
     */
    activityLogEnabled?: pulumi.Input<boolean>;
    /**
     * Configuration block for antivirus traffic scanning.
     */
    antivirus?: pulumi.Input<inputs.TeamsAccountAntivirus>;
    /**
     * Configuration for a custom block page.
     */
    blockPage?: pulumi.Input<inputs.TeamsAccountBlockPage>;
    /**
     * Configure compliance with Federal Information Processing Standards.
     */
    fips?: pulumi.Input<inputs.TeamsAccountFips>;
    logging?: pulumi.Input<inputs.TeamsAccountLogging>;
    /**
     * Configuration for DLP Payload Logging.
     */
    payloadLog?: pulumi.Input<inputs.TeamsAccountPayloadLog>;
    /**
     * Configuration block for specifying which protocols are proxied.
     */
    proxy?: pulumi.Input<inputs.TeamsAccountProxy>;
    /**
     * Indicator that decryption of TLS traffic is enabled.
     */
    tlsDecryptEnabled?: pulumi.Input<boolean>;
    /**
     * Safely browse websites in Browser Isolation through a URL.
     */
    urlBrowserIsolationEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a TeamsAccount resource.
 */
export interface TeamsAccountArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Whether to enable the activity log.
     */
    activityLogEnabled?: pulumi.Input<boolean>;
    /**
     * Configuration block for antivirus traffic scanning.
     */
    antivirus?: pulumi.Input<inputs.TeamsAccountAntivirus>;
    /**
     * Configuration for a custom block page.
     */
    blockPage?: pulumi.Input<inputs.TeamsAccountBlockPage>;
    /**
     * Configure compliance with Federal Information Processing Standards.
     */
    fips?: pulumi.Input<inputs.TeamsAccountFips>;
    logging?: pulumi.Input<inputs.TeamsAccountLogging>;
    /**
     * Configuration for DLP Payload Logging.
     */
    payloadLog?: pulumi.Input<inputs.TeamsAccountPayloadLog>;
    /**
     * Configuration block for specifying which protocols are proxied.
     */
    proxy?: pulumi.Input<inputs.TeamsAccountProxy>;
    /**
     * Indicator that decryption of TLS traffic is enabled.
     */
    tlsDecryptEnabled?: pulumi.Input<boolean>;
    /**
     * Safely browse websites in Browser Isolation through a URL.
     */
    urlBrowserIsolationEnabled?: pulumi.Input<boolean>;
}
