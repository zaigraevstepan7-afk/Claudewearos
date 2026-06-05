package nc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzbpk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: e, reason: collision with root package name */
    public a f12212e;

    /* renamed from: f, reason: collision with root package name */
    public fc.c f12213f;

    /* renamed from: g, reason: collision with root package name */
    public fc.h[] f12214g;

    /* renamed from: h, reason: collision with root package name */
    public gc.e f12215h;
    public fc.x j;

    /* renamed from: k, reason: collision with root package name */
    public String f12217k;

    /* renamed from: l, reason: collision with root package name */
    public final fc.k f12218l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12219m;

    /* renamed from: a, reason: collision with root package name */
    public final zzbpk f12208a = new zzbpk();

    /* renamed from: c, reason: collision with root package name */
    public final fc.w f12210c = new fc.w();

    /* renamed from: d, reason: collision with root package name */
    public final r2 f12211d = new r2(this);

    /* renamed from: b, reason: collision with root package name */
    public final r3 f12209b = r3.f12201a;

    /* renamed from: i, reason: collision with root package name */
    public m0 f12216i = null;

    public s2(fc.k kVar) {
        this.f12218l = kVar;
        new AtomicBoolean(false);
    }

    public static s3 a(Context context, fc.h[] hVarArr) {
        for (fc.h hVar : hVarArr) {
            if (hVar.equals(fc.h.f6697k)) {
                return new s3("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        s3 s3Var = new s3(context, hVarArr);
        s3Var.C = false;
        return s3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[Catch: RemoteException -> 0x00d2, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00d2, blocks: (B:28:0x009e, B:30:0x00a4, B:32:0x00b2, B:34:0x00c4, B:37:0x00d4), top: B:51:0x009e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(nc.q2 r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.s2.b(nc.q2):void");
    }

    public final void c(a aVar) {
        try {
            this.f12212e = aVar;
            m0 m0Var = this.f12216i;
            if (m0Var != null) {
                m0Var.zzC(aVar != null ? new q(aVar) : null);
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }

    public final void d(fc.h... hVarArr) {
        fc.k kVar = this.f12218l;
        this.f12214g = hVarArr;
        try {
            m0 m0Var = this.f12216i;
            if (m0Var != null) {
                m0Var.zzF(a(kVar.getContext(), this.f12214g));
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
        kVar.requestLayout();
    }

    public final void e(gc.e eVar) {
        try {
            this.f12215h = eVar;
            m0 m0Var = this.f12216i;
            if (m0Var != null) {
                m0Var.zzG(eVar != null ? new zzazp(eVar) : null);
            }
        } catch (RemoteException e10) {
            rc.k.i("#007 Could not call remote method.", e10);
        }
    }
}
