/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.webank.blockchain.hsm.crypto.sdf;

import com.webank.blockchain.hsm.crypto.utils.NativeUtils;
import java.io.IOException;

public class SDFJNI {
    private static final String LIB_RELAY_FFI_NAME = "bin/libsdf-crypto";
    private static final String LIB_FFI_NAME = "bin/libsdf-crypto-jni";

    public static final native int SM2_get();

    public static final native int SM3_get();

    public static final native int SM4_CBC_get();

    public static final native void SDFCryptoResult_signature_set(
            long jarg1, SDFCryptoResult jarg1_, String jarg2);

    public static final native String SDFCryptoResult_signature_get(
            long jarg1, SDFCryptoResult jarg1_);

    public static final native void SDFCryptoResult_publicKey_set(
            long jarg1, SDFCryptoResult jarg1_, String jarg2);

    public static final native String SDFCryptoResult_publicKey_get(
            long jarg1, SDFCryptoResult jarg1_);

    public static final native void SDFCryptoResult_privateKey_set(
            long jarg1, SDFCryptoResult jarg1_, String jarg2);

    public static final native String SDFCryptoResult_privateKey_get(
            long jarg1, SDFCryptoResult jarg1_);

    public static final native void SDFCryptoResult_result_set(
            long jarg1, SDFCryptoResult jarg1_, boolean jarg2);

    public static final native boolean SDFCryptoResult_result_get(
            long jarg1, SDFCryptoResult jarg1_);

    public static final native void SDFCryptoResult_hash_set(
            long jarg1, SDFCryptoResult jarg1_, String jarg2);

    public static final native String SDFCryptoResult_hash_get(long jarg1, SDFCryptoResult jarg1_);

    public static final native void SDFCryptoResult_sdfErrorMessage_set(
            long jarg1, SDFCryptoResult jarg1_, String jarg2);

    public static final native String SDFCryptoResult_sdfErrorMessage_get(
            long jarg1, SDFCryptoResult jarg1_);

    public static final native long new_SDFCryptoResult();

    public static final native void delete_SDFCryptoResult(long jarg1);

    public static final native long KeyGen(int jarg1);

    public static final native long Sign(String jarg1, int jarg2, String jarg3);

    public static final native long SignWithInternalKey(
            long jarg1, String jarg2, int jarg3, String jarg4);

    public static final native long Verify(String jarg1, int jarg2, String jarg3, String jarg4);

    public static final native long VerifyWithInternalKey(
            long jarg1, int jarg2, String jarg3, String jarg4);

    public static final native long Hash(String jarg1, int jarg2, String jarg3);

    public static final native long ExportInternalPublicKey(long jarg1, int jarg2);

    public static final native long HashWithZ(String jarg1, int jarg2, String jarg3);

    static {
        try {
            String os = System.getProperty("os.name");
            String tail = NativeUtils.getResourceTailByOs(os);
            NativeUtils.loadLibrary(LIB_RELAY_FFI_NAME + tail);
            NativeUtils.loadLibrary(LIB_FFI_NAME + tail);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load library ", e);
        }
    }
}
