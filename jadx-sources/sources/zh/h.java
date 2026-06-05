package zh;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h implements com.google.android.gms.common.api.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f20634a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z2) {
        Random random = i.j;
        synchronized (i.class) {
            Iterator it = i.f20635k.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).d(z2);
            }
        }
    }
}
