package mc;

import android.content.Context;
import com.google.android.gms.internal.ads.zzart;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzavk;
import xc.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11552c;

    public /* synthetic */ h(Object obj, boolean z2, int i10) {
        this.f11550a = i10;
        this.f11552c = obj;
        this.f11551b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f11550a) {
            case 0:
                i iVar = (i) this.f11552c;
                boolean z2 = this.f11551b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Context context = iVar.C;
                    rc.a aVar = iVar.E;
                    boolean z10 = iVar.F;
                    zzart zzartVarZza = zzarv.zza();
                    zzartVarZza.zza(z2);
                    zzartVarZza.zzb(aVar.f14321a);
                    zzarv zzarvVar = (zzarv) zzartVarZza.zzbr();
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzavk.zza(context, zzarvVar, z10).zzp();
                    break;
                } catch (NullPointerException e10) {
                    iVar.A.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                    return;
                }
            default:
                ((g0) this.f11552c).e(this.f11551b, false);
                break;
        }
    }
}
