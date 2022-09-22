// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which manages Cloudflare Pages projects.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewPagesProject(ctx, "basicProject", &cloudflare.PagesProjectArgs{
//				AccountId:        pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:             pulumi.String("this-is-my-project-01"),
//				ProductionBranch: pulumi.String("main"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewPagesProject(ctx, "buildConfig", &cloudflare.PagesProjectArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				BuildConfig: &PagesProjectBuildConfigArgs{
//					BuildCommand:      pulumi.String("npm run build"),
//					DestinationDir:    pulumi.String("build"),
//					RootDir:           pulumi.String("/"),
//					WebAnalyticsTag:   pulumi.String("cee1c73f6e4743d0b5e6bb1a0bcaabcc"),
//					WebAnalyticsToken: pulumi.String("021e1057c18547eca7b79f2516f06o7x"),
//				},
//				Name:             pulumi.String("this-is-my-project-01"),
//				ProductionBranch: pulumi.String("main"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewPagesProject(ctx, "sourceConfig", &cloudflare.PagesProjectArgs{
//				AccountId:        pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:             pulumi.String("this-is-my-project-01"),
//				ProductionBranch: pulumi.String("main"),
//				Source: &PagesProjectSourceArgs{
//					Config: &PagesProjectSourceConfigArgs{
//						DeploymentsEnabled: pulumi.Bool(true),
//						Owner:              pulumi.String("cloudflare"),
//						PrCommentsEnabled:  pulumi.Bool(true),
//						PreviewBranchExcludes: pulumi.StringArray{
//							pulumi.String("main"),
//							pulumi.String("prod"),
//						},
//						PreviewBranchIncludes: pulumi.StringArray{
//							pulumi.String("dev"),
//							pulumi.String("preview"),
//						},
//						PreviewDeploymentSetting:    pulumi.String("custom"),
//						ProductionBranch:            pulumi.String("main"),
//						ProductionDeploymentEnabled: pulumi.Bool(true),
//						RepoName:                    pulumi.String("ninjakittens"),
//					},
//					Type: pulumi.String("github"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewPagesProject(ctx, "deploymentConfigs", &cloudflare.PagesProjectArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				DeploymentConfigs: &PagesProjectDeploymentConfigsArgs{
//					Preview: &PagesProjectDeploymentConfigsPreviewArgs{
//						CompatibilityDate: pulumi.String("2022-08-15"),
//						CompatibilityFlags: pulumi.StringArray{
//							pulumi.String("preview_flag"),
//						},
//						D1Databases: pulumi.AnyMap{
//							"D1BINDING": pulumi.Any("445e2955-951a-4358-a35b-a4d0c813f63"),
//						},
//						DurableObjectNamespaces: pulumi.AnyMap{
//							"DOBINDING": pulumi.Any("5eb63bbbe01eeed093cb22bb8f5acdc3"),
//						},
//						EnvironmentVariables: pulumi.AnyMap{
//							"ENVIRONMENT": pulumi.Any("preview"),
//						},
//						KvNamespaces: pulumi.AnyMap{
//							"KVBINDING": pulumi.Any("5eb63bbbe01eeed093cb22bb8f5acdc3"),
//						},
//						R2Buckets: pulumi.AnyMap{
//							"R2BINDING": pulumi.Any("some-bucket"),
//						},
//					},
//					Production: &PagesProjectDeploymentConfigsProductionArgs{
//						CompatibilityDate: pulumi.String("2022-08-16"),
//						CompatibilityFlags: pulumi.StringArray{
//							pulumi.String("production_flag"),
//							pulumi.String("second flag"),
//						},
//						D1Databases: pulumi.AnyMap{
//							"D1BINDING1": pulumi.Any("445e2955-951a-4358-a35b-a4d0c813f63"),
//							"D1BINDING2": pulumi.Any("a399414b-c697-409a-a688-377db6433cd9"),
//						},
//						DurableObjectNamespaces: pulumi.AnyMap{
//							"DOBINDING1": pulumi.Any("5eb63bbbe01eeed093cb22bb8f5acdc3"),
//							"DOBINDING2": pulumi.Any("3cdca5f8bb22bc390deee10ebbb36be5"),
//						},
//						EnvironmentVariables: pulumi.AnyMap{
//							"ENVIRONMENT": pulumi.Any("production"),
//							"OTHERVALUE":  pulumi.Any("other value"),
//						},
//						KvNamespaces: pulumi.AnyMap{
//							"KVBINDING1": pulumi.Any("5eb63bbbe01eeed093cb22bb8f5acdc3"),
//							"KVBINDING2": pulumi.Any("3cdca5f8bb22bc390deee10ebbb36be5"),
//						},
//						R2Buckets: pulumi.AnyMap{
//							"R2BINDING1": pulumi.Any("some-bucket"),
//							"R2BINDING2": pulumi.Any("other-bucket"),
//						},
//					},
//				},
//				Name:             pulumi.String("this-is-my-project-01"),
//				ProductionBranch: pulumi.String("main"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/pagesProject:PagesProject example <account_id>/<project_name>
//
// ```
type PagesProject struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Configuration for the project build process.
	BuildConfig PagesProjectBuildConfigPtrOutput `pulumi:"buildConfig"`
	// When the project was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Configuration for deployments in a project.
	DeploymentConfigs PagesProjectDeploymentConfigsPtrOutput `pulumi:"deploymentConfigs"`
	// A list of associated custom domains for the project.
	Domains pulumi.StringArrayOutput `pulumi:"domains"`
	// Name of the project.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the branch that is used for the production environment.
	ProductionBranch pulumi.StringOutput `pulumi:"productionBranch"`
	// Configuration for the project source.
	Source PagesProjectSourcePtrOutput `pulumi:"source"`
	// The Cloudflare subdomain associated with the project.
	Subdomain pulumi.StringOutput `pulumi:"subdomain"`
}

// NewPagesProject registers a new resource with the given unique name, arguments, and options.
func NewPagesProject(ctx *pulumi.Context,
	name string, args *PagesProjectArgs, opts ...pulumi.ResourceOption) (*PagesProject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.ProductionBranch == nil {
		return nil, errors.New("invalid value for required argument 'ProductionBranch'")
	}
	var resource PagesProject
	err := ctx.RegisterResource("cloudflare:index/pagesProject:PagesProject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPagesProject gets an existing PagesProject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPagesProject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PagesProjectState, opts ...pulumi.ResourceOption) (*PagesProject, error) {
	var resource PagesProject
	err := ctx.ReadResource("cloudflare:index/pagesProject:PagesProject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PagesProject resources.
type pagesProjectState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Configuration for the project build process.
	BuildConfig *PagesProjectBuildConfig `pulumi:"buildConfig"`
	// When the project was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Configuration for deployments in a project.
	DeploymentConfigs *PagesProjectDeploymentConfigs `pulumi:"deploymentConfigs"`
	// A list of associated custom domains for the project.
	Domains []string `pulumi:"domains"`
	// Name of the project.
	Name *string `pulumi:"name"`
	// The name of the branch that is used for the production environment.
	ProductionBranch *string `pulumi:"productionBranch"`
	// Configuration for the project source.
	Source *PagesProjectSource `pulumi:"source"`
	// The Cloudflare subdomain associated with the project.
	Subdomain *string `pulumi:"subdomain"`
}

type PagesProjectState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Configuration for the project build process.
	BuildConfig PagesProjectBuildConfigPtrInput
	// When the project was created.
	CreatedOn pulumi.StringPtrInput
	// Configuration for deployments in a project.
	DeploymentConfigs PagesProjectDeploymentConfigsPtrInput
	// A list of associated custom domains for the project.
	Domains pulumi.StringArrayInput
	// Name of the project.
	Name pulumi.StringPtrInput
	// The name of the branch that is used for the production environment.
	ProductionBranch pulumi.StringPtrInput
	// Configuration for the project source.
	Source PagesProjectSourcePtrInput
	// The Cloudflare subdomain associated with the project.
	Subdomain pulumi.StringPtrInput
}

func (PagesProjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*pagesProjectState)(nil)).Elem()
}

type pagesProjectArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Configuration for the project build process.
	BuildConfig *PagesProjectBuildConfig `pulumi:"buildConfig"`
	// Configuration for deployments in a project.
	DeploymentConfigs *PagesProjectDeploymentConfigs `pulumi:"deploymentConfigs"`
	// Name of the project.
	Name string `pulumi:"name"`
	// The name of the branch that is used for the production environment.
	ProductionBranch string `pulumi:"productionBranch"`
	// Configuration for the project source.
	Source *PagesProjectSource `pulumi:"source"`
}

// The set of arguments for constructing a PagesProject resource.
type PagesProjectArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Configuration for the project build process.
	BuildConfig PagesProjectBuildConfigPtrInput
	// Configuration for deployments in a project.
	DeploymentConfigs PagesProjectDeploymentConfigsPtrInput
	// Name of the project.
	Name pulumi.StringInput
	// The name of the branch that is used for the production environment.
	ProductionBranch pulumi.StringInput
	// Configuration for the project source.
	Source PagesProjectSourcePtrInput
}

func (PagesProjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pagesProjectArgs)(nil)).Elem()
}

type PagesProjectInput interface {
	pulumi.Input

	ToPagesProjectOutput() PagesProjectOutput
	ToPagesProjectOutputWithContext(ctx context.Context) PagesProjectOutput
}

func (*PagesProject) ElementType() reflect.Type {
	return reflect.TypeOf((**PagesProject)(nil)).Elem()
}

func (i *PagesProject) ToPagesProjectOutput() PagesProjectOutput {
	return i.ToPagesProjectOutputWithContext(context.Background())
}

func (i *PagesProject) ToPagesProjectOutputWithContext(ctx context.Context) PagesProjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagesProjectOutput)
}

// PagesProjectArrayInput is an input type that accepts PagesProjectArray and PagesProjectArrayOutput values.
// You can construct a concrete instance of `PagesProjectArrayInput` via:
//
//	PagesProjectArray{ PagesProjectArgs{...} }
type PagesProjectArrayInput interface {
	pulumi.Input

	ToPagesProjectArrayOutput() PagesProjectArrayOutput
	ToPagesProjectArrayOutputWithContext(context.Context) PagesProjectArrayOutput
}

type PagesProjectArray []PagesProjectInput

func (PagesProjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PagesProject)(nil)).Elem()
}

func (i PagesProjectArray) ToPagesProjectArrayOutput() PagesProjectArrayOutput {
	return i.ToPagesProjectArrayOutputWithContext(context.Background())
}

func (i PagesProjectArray) ToPagesProjectArrayOutputWithContext(ctx context.Context) PagesProjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagesProjectArrayOutput)
}

// PagesProjectMapInput is an input type that accepts PagesProjectMap and PagesProjectMapOutput values.
// You can construct a concrete instance of `PagesProjectMapInput` via:
//
//	PagesProjectMap{ "key": PagesProjectArgs{...} }
type PagesProjectMapInput interface {
	pulumi.Input

	ToPagesProjectMapOutput() PagesProjectMapOutput
	ToPagesProjectMapOutputWithContext(context.Context) PagesProjectMapOutput
}

type PagesProjectMap map[string]PagesProjectInput

func (PagesProjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PagesProject)(nil)).Elem()
}

func (i PagesProjectMap) ToPagesProjectMapOutput() PagesProjectMapOutput {
	return i.ToPagesProjectMapOutputWithContext(context.Background())
}

func (i PagesProjectMap) ToPagesProjectMapOutputWithContext(ctx context.Context) PagesProjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagesProjectMapOutput)
}

type PagesProjectOutput struct{ *pulumi.OutputState }

func (PagesProjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PagesProject)(nil)).Elem()
}

func (o PagesProjectOutput) ToPagesProjectOutput() PagesProjectOutput {
	return o
}

func (o PagesProjectOutput) ToPagesProjectOutputWithContext(ctx context.Context) PagesProjectOutput {
	return o
}

// The account identifier to target for the resource.
func (o PagesProjectOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *PagesProject) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Configuration for the project build process.
func (o PagesProjectOutput) BuildConfig() PagesProjectBuildConfigPtrOutput {
	return o.ApplyT(func(v *PagesProject) PagesProjectBuildConfigPtrOutput { return v.BuildConfig }).(PagesProjectBuildConfigPtrOutput)
}

// When the project was created.
func (o PagesProjectOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *PagesProject) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Configuration for deployments in a project.
func (o PagesProjectOutput) DeploymentConfigs() PagesProjectDeploymentConfigsPtrOutput {
	return o.ApplyT(func(v *PagesProject) PagesProjectDeploymentConfigsPtrOutput { return v.DeploymentConfigs }).(PagesProjectDeploymentConfigsPtrOutput)
}

// A list of associated custom domains for the project.
func (o PagesProjectOutput) Domains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PagesProject) pulumi.StringArrayOutput { return v.Domains }).(pulumi.StringArrayOutput)
}

// Name of the project.
func (o PagesProjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PagesProject) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the branch that is used for the production environment.
func (o PagesProjectOutput) ProductionBranch() pulumi.StringOutput {
	return o.ApplyT(func(v *PagesProject) pulumi.StringOutput { return v.ProductionBranch }).(pulumi.StringOutput)
}

// Configuration for the project source.
func (o PagesProjectOutput) Source() PagesProjectSourcePtrOutput {
	return o.ApplyT(func(v *PagesProject) PagesProjectSourcePtrOutput { return v.Source }).(PagesProjectSourcePtrOutput)
}

// The Cloudflare subdomain associated with the project.
func (o PagesProjectOutput) Subdomain() pulumi.StringOutput {
	return o.ApplyT(func(v *PagesProject) pulumi.StringOutput { return v.Subdomain }).(pulumi.StringOutput)
}

type PagesProjectArrayOutput struct{ *pulumi.OutputState }

func (PagesProjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PagesProject)(nil)).Elem()
}

func (o PagesProjectArrayOutput) ToPagesProjectArrayOutput() PagesProjectArrayOutput {
	return o
}

func (o PagesProjectArrayOutput) ToPagesProjectArrayOutputWithContext(ctx context.Context) PagesProjectArrayOutput {
	return o
}

func (o PagesProjectArrayOutput) Index(i pulumi.IntInput) PagesProjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PagesProject {
		return vs[0].([]*PagesProject)[vs[1].(int)]
	}).(PagesProjectOutput)
}

type PagesProjectMapOutput struct{ *pulumi.OutputState }

func (PagesProjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PagesProject)(nil)).Elem()
}

func (o PagesProjectMapOutput) ToPagesProjectMapOutput() PagesProjectMapOutput {
	return o
}

func (o PagesProjectMapOutput) ToPagesProjectMapOutputWithContext(ctx context.Context) PagesProjectMapOutput {
	return o
}

func (o PagesProjectMapOutput) MapIndex(k pulumi.StringInput) PagesProjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PagesProject {
		return vs[0].(map[string]*PagesProject)[vs[1].(string)]
	}).(PagesProjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PagesProjectInput)(nil)).Elem(), &PagesProject{})
	pulumi.RegisterInputType(reflect.TypeOf((*PagesProjectArrayInput)(nil)).Elem(), PagesProjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PagesProjectMapInput)(nil)).Elem(), PagesProjectMap{})
	pulumi.RegisterOutputType(PagesProjectOutput{})
	pulumi.RegisterOutputType(PagesProjectArrayOutput{})
	pulumi.RegisterOutputType(PagesProjectMapOutput{})
}