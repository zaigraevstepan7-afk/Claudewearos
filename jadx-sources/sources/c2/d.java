package c2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2972b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f2971a = i10;
        this.f2972b = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.f2971a) {
            case 0:
                return;
            default:
                b1.i iVar = (b1.i) this.f2972b;
                synchronized (iVar) {
                    if (((h8.r) ((WeakReference) iVar.f1488b).get()) == null) {
                        iVar.b();
                    }
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.f2971a) {
            case 0:
                break;
            default:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        q8.c cVarC;
        long jB;
        switch (this.f2971a) {
            case 0:
                if (i10 >= 40) {
                    ((f) this.f2972b).getClass();
                    return;
                }
                return;
            default:
                b1.i iVar = (b1.i) this.f2972b;
                synchronized (iVar) {
                    try {
                        h8.r rVar = (h8.r) ((WeakReference) iVar.f1488b).get();
                        if (rVar != null) {
                            h8.p pVar = rVar.f7726a;
                            if (i10 >= 40) {
                                q8.c cVarC2 = rVar.c();
                                if (cVarC2 != null) {
                                    synchronized (cVarC2.f13299c) {
                                        ((q8.e) cVarC2.f13297a.f13184c).d(-1L);
                                        k4.d dVar = cVarC2.f13298b;
                                        dVar.f9420a = 0;
                                        ((LinkedHashMap) dVar.f9421b).clear();
                                    }
                                }
                            } else if (i10 >= 20) {
                                ((v8.a) iVar.f1489c).a(pVar.f7712a);
                            } else if (i10 >= 10 && (cVarC = rVar.c()) != null) {
                                synchronized (cVarC.f13299c) {
                                    jB = ((q8.e) cVarC.f13297a.f13184c).b();
                                }
                                long j = jB / 2;
                                synchronized (cVarC.f13299c) {
                                    ((q8.e) cVarC.f13297a.f13184c).d(j);
                                }
                            }
                        } else {
                            iVar.b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    private final void b() {
    }

    private final void a(Configuration configuration) {
    }
}
