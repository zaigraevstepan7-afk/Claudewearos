package cg;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements com.google.android.gms.common.api.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f3363a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.b
    public final void a(boolean z2) {
        synchronized (i.j) {
            try {
                ArrayList arrayList = new ArrayList(i.f3366k.values());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    i iVar = (i) obj;
                    if (iVar.f3371e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = iVar.f3375i.iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).a(z2);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
