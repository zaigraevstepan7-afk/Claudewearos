package ja;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8788a;

    public k(Context context) {
        SharedPreferences sharedPreferences;
        fj.l.f(context, "context");
        context.getApplicationContext();
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        if (keyGenParameterSpecBuild == null) {
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }
        Object obj = d7.d.f4988a;
        if (keyGenParameterSpecBuild.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpecBuild.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpecBuild.getBlockModes()));
        }
        if (keyGenParameterSpecBuild.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpecBuild.getPurposes());
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpecBuild.getEncryptionPaddings()));
        }
        if (keyGenParameterSpecBuild.isUserAuthenticationRequired() && keyGenParameterSpecBuild.getUserAuthenticationValidityDurationSeconds() < 1) {
            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
        }
        synchronized (d7.d.f4988a) {
            String keystoreAlias = keyGenParameterSpecBuild.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                } catch (ProviderException e10) {
                    throw new GeneralSecurityException(e10.getMessage(), e10);
                }
            }
        }
        try {
            sharedPreferences = d7.b.a(context, new d7.c(keyGenParameterSpecBuild.getKeystoreAlias(), keyGenParameterSpecBuild));
        } catch (Exception unused) {
            sharedPreferences = context.getSharedPreferences("folder_pin_store_fallback", 0);
            fj.l.c(sharedPreferences);
        }
        this.f8788a = sharedPreferences;
    }

    public final boolean a() {
        return this.f8788a.contains("universal_passcode");
    }
}
