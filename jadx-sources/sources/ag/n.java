package ag;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md.m f453a;

    public n(md.m mVar) {
        this.f453a = mVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() throws InvalidKeyException {
        md.m mVar = this.f453a;
        try {
            k kVar = k.f451c;
            Mac mac = (Mac) kVar.f452a.q((String) mVar.f11640c);
            mac.init((SecretKeySpec) mVar.f11641d);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
