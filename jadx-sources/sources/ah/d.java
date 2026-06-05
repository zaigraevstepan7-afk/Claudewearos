package ah;

import android.os.Looper;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzbet;
import qc.l0;
import qc.o0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f462b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f461a = i10;
        this.f462b = obj;
    }

    private final void a() {
        o0 o0Var = (o0) this.f462b;
        if (o0Var.f13415b) {
            if (!(o0Var.i() && o0Var.j()) && ((Boolean) zzbet.zzb.zze()).booleanValue()) {
                synchronized (o0Var.f13414a) {
                    try {
                        if (Looper.getMainLooper() == null) {
                            return;
                        }
                        if (o0Var.f13418e == null) {
                            o0Var.f13418e = new zzbaa();
                        }
                        o0Var.f13418e.zzd();
                        int i10 = l0.f13401b;
                        k.f("start fetching content...");
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.d.run():void");
    }
}
