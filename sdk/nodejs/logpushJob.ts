// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Logpush jobs can be imported using a composite ID formed of* `identifierType` - Either `account` or `zone`. * `identifierID` - The ID of the account or zone. * `jobID` - The Logpush Job ID to import. Import an account-scoped job using `account/:accountID/:jobID`
 *
 * ```sh
 *  $ pulumi import cloudflare:index/logpushJob:LogpushJob example account/1d5fdc9e88c8a8c4518b068cd94331fe/54321
 * ```
 *
 *  Import a zone-scoped job using `zone/:zoneID/:jobID`
 *
 * ```sh
 *  $ pulumi import cloudflare:index/logpushJob:LogpushJob example zone/d41d8cd98f00b204e9800998ecf8427e/54321
 * ```
 */
export class LogpushJob extends pulumi.CustomResource {
    /**
     * Get an existing LogpushJob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LogpushJobState, opts?: pulumi.CustomResourceOptions): LogpushJob {
        return new LogpushJob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/logpushJob:LogpushJob';

    /**
     * Returns true if the given object is an instance of LogpushJob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LogpushJob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LogpushJob.__pulumiType;
    }

    /**
     * The account ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Which type of dataset resource to use. Available values are
     * - [account-scoped](https://developers.cloudflare.com/logs/reference/log-fields/account): `"auditLogs"`, `"gatewayDns"`, `"gatewayHttp"`, `"gatewayNetwork"`
     * - [zone-scoped](https://developers.cloudflare.com/logs/reference/log-fields/zone): `"firewallEvents"`, `"httpRequests"`, `"spectrumEvents"`, `"nelReports", "dnsLogs"`
     */
    public readonly dataset!: pulumi.Output<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     */
    public readonly destinationConf!: pulumi.Output<string>;
    /**
     * Whether to enable the job.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     */
    public readonly logpullOptions!: pulumi.Output<string | undefined>;
    /**
     * The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
     */
    public readonly name!: pulumi.Output<string | undefined>;
    /**
     * Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage,
     * Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     */
    public readonly ownershipChallenge!: pulumi.Output<string | undefined>;
    /**
     * The zone ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a LogpushJob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LogpushJobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LogpushJobArgs | LogpushJobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LogpushJobState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["dataset"] = state ? state.dataset : undefined;
            resourceInputs["destinationConf"] = state ? state.destinationConf : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["logpullOptions"] = state ? state.logpullOptions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownershipChallenge"] = state ? state.ownershipChallenge : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as LogpushJobArgs | undefined;
            if ((!args || args.dataset === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataset'");
            }
            if ((!args || args.destinationConf === undefined) && !opts.urn) {
                throw new Error("Missing required property 'destinationConf'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["dataset"] = args ? args.dataset : undefined;
            resourceInputs["destinationConf"] = args ? args.destinationConf : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["logpullOptions"] = args ? args.logpullOptions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ownershipChallenge"] = args ? args.ownershipChallenge : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LogpushJob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LogpushJob resources.
 */
export interface LogpushJobState {
    /**
     * The account ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Which type of dataset resource to use. Available values are
     * - [account-scoped](https://developers.cloudflare.com/logs/reference/log-fields/account): `"auditLogs"`, `"gatewayDns"`, `"gatewayHttp"`, `"gatewayNetwork"`
     * - [zone-scoped](https://developers.cloudflare.com/logs/reference/log-fields/zone): `"firewallEvents"`, `"httpRequests"`, `"spectrumEvents"`, `"nelReports", "dnsLogs"`
     */
    dataset?: pulumi.Input<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     */
    destinationConf?: pulumi.Input<string>;
    /**
     * Whether to enable the job.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     */
    logpullOptions?: pulumi.Input<string>;
    /**
     * The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
     */
    name?: pulumi.Input<string>;
    /**
     * Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage,
     * Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     */
    ownershipChallenge?: pulumi.Input<string>;
    /**
     * The zone ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LogpushJob resource.
 */
export interface LogpushJobArgs {
    /**
     * The account ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Which type of dataset resource to use. Available values are
     * - [account-scoped](https://developers.cloudflare.com/logs/reference/log-fields/account): `"auditLogs"`, `"gatewayDns"`, `"gatewayHttp"`, `"gatewayNetwork"`
     * - [zone-scoped](https://developers.cloudflare.com/logs/reference/log-fields/zone): `"firewallEvents"`, `"httpRequests"`, `"spectrumEvents"`, `"nelReports", "dnsLogs"`
     */
    dataset: pulumi.Input<string>;
    /**
     * Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
     */
    destinationConf: pulumi.Input<string>;
    /**
     * Whether to enable the job.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
     */
    logpullOptions?: pulumi.Input<string>;
    /**
     * The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
     */
    name?: pulumi.Input<string>;
    /**
     * Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage,
     * Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
     */
    ownershipChallenge?: pulumi.Input<string>;
    /**
     * The zone ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
     */
    zoneId?: pulumi.Input<string>;
}
