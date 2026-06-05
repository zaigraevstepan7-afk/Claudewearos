package d7;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4986a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f4987b;

    public c(String str) {
        this.f4987b = str;
    }

    public final String toString() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        boolean zContainsAlias;
        switch (this.f4986a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("MasterKey{keyAlias=");
                String str = this.f4987b;
                sb2.append(str);
                sb2.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    zContainsAlias = keyStore.containsAlias(str);
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    zContainsAlias = false;
                }
                sb2.append(zContainsAlias);
                sb2.append("}");
                return sb2.toString();
            default:
                return m6.a.i(new StringBuilder("<"), this.f4987b, '>');
        }
    }

    public c(String str, KeyGenParameterSpec keyGenParameterSpec) {
        this.f4987b = str;
    }
}
