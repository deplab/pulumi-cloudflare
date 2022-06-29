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
    /// Worker Cron Triggers allow users to map a cron expression to a Worker script
    /// using a `ScheduledEvent` listener that enables Workers to be executed on a
    /// schedule. Worker Cron Triggers are ideal for running periodic jobs for
    /// maintenance or calling third-party APIs to collect up-to-date data.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.IO;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleScript = new Cloudflare.WorkerScript("exampleScript", new Cloudflare.WorkerScriptArgs
    ///         {
    ///             Name = "example-script",
    ///             Content = File.ReadAllText("path/to/my.js"),
    ///         });
    ///         var exampleTrigger = new Cloudflare.WorkerCronTrigger("exampleTrigger", new Cloudflare.WorkerCronTriggerArgs
    ///         {
    ///             ScriptName = exampleScript.Name,
    ///             Schedules = 
    ///             {
    ///                 "*/5 * * * *",
    ///                 "10 7 * * mon-fri",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Worker Cron Triggers can be imported using the script name of the Worker they are targeting.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example my-script
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workerCronTrigger:WorkerCronTrigger")]
    public partial class WorkerCronTrigger : Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// List of cron expressions to execute the Worker Script
        /// </summary>
        [Output("schedules")]
        public Output<ImmutableArray<string>> Schedules { get; private set; } = null!;

        /// <summary>
        /// Worker script to target for the schedules
        /// </summary>
        [Output("scriptName")]
        public Output<string> ScriptName { get; private set; } = null!;


        /// <summary>
        /// Create a WorkerCronTrigger resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkerCronTrigger(string name, WorkerCronTriggerArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerCronTrigger:WorkerCronTrigger", name, args ?? new WorkerCronTriggerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkerCronTrigger(string name, Input<string> id, WorkerCronTriggerState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerCronTrigger:WorkerCronTrigger", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkerCronTrigger resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkerCronTrigger Get(string name, Input<string> id, WorkerCronTriggerState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkerCronTrigger(name, id, state, options);
        }
    }

    public sealed class WorkerCronTriggerArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("schedules", required: true)]
        private InputList<string>? _schedules;

        /// <summary>
        /// List of cron expressions to execute the Worker Script
        /// </summary>
        public InputList<string> Schedules
        {
            get => _schedules ?? (_schedules = new InputList<string>());
            set => _schedules = value;
        }

        /// <summary>
        /// Worker script to target for the schedules
        /// </summary>
        [Input("scriptName", required: true)]
        public Input<string> ScriptName { get; set; } = null!;

        public WorkerCronTriggerArgs()
        {
        }
    }

    public sealed class WorkerCronTriggerState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("schedules")]
        private InputList<string>? _schedules;

        /// <summary>
        /// List of cron expressions to execute the Worker Script
        /// </summary>
        public InputList<string> Schedules
        {
            get => _schedules ?? (_schedules = new InputList<string>());
            set => _schedules = value;
        }

        /// <summary>
        /// Worker script to target for the schedules
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        public WorkerCronTriggerState()
        {
        }
    }
}
