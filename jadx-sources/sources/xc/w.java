package xc;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdei;
import org.json.JSONException;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w implements zzdei {

    /* renamed from: a, reason: collision with root package name */
    public final o f20032a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20033b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20034c;

    public w(o oVar, int i10, String str) {
        this.f20032a = oVar;
        this.f20033b = i10;
        this.f20034c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(v vVar) throws JSONException {
        if (vVar == null || this.f20033b != 2 || TextUtils.isEmpty(this.f20034c)) {
            return;
        }
        f fVar = new f(1, this, vVar);
        qc.m0 m0Var = r0.f13445l;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            fVar.run();
        } else {
            zzcad.zza.execute(fVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
    }
}
