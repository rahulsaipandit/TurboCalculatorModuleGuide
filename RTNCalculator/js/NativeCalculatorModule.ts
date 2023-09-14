// The file must be named Native<MODULE_NAME>, with a .js or .jsx extension when using Flow,
// or a .ts, or .tsx extension when using TypeScript. Codegen will only look for files matching this pattern.

import type {TurboModule} from "react-native";
//import type {TurboModule} from 'react-native/Libraries/TurboModule/RCTExport'; //use only for old versions
import {TurboModuleRegistry} from "react-native";

export interface Spec extends TurboModule {
  // getHelloWorld(first: string, second: string): string;
  add(a: number, b: number): Promise<number>;
}

// export default TurboModuleRegistry.getEnforcing<Spec>('NativeSampleModule', );
export default TurboModuleRegistry.get<Spec>('NativeCalculatorModule',  ) as Spec | null;
//export default TurboModuleRegistry.getEnforcing<Spec>('NativeRTNCalculatorModule', );
