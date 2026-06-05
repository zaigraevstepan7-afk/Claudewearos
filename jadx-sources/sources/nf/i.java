package nf;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f12323a = new CopyOnWriteArrayList();

    public static tf.c a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        Iterator it = f12323a.iterator();
        while (it.hasNext()) {
            tf.c cVar = (tf.c) it.next();
            synchronized (cVar) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(m1.i("No KMS client does support: ", str));
    }
}
