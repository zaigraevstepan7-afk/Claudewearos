package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import cg.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ig.a;
import ig.b0;
import ig.c;
import ig.d;
import ig.l;
import ig.m;
import ig.r;
import ig.t;
import ig.u;
import ig.v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import jg.e;
import jg.f;
import jg.h;
import jg.p;
import jg.s;
import jg.x;
import jg.y;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaak extends zzadj {
    public zzaak(i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaci(iVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(i iVar, String str, String str2) {
        return zza((zzaaj) new zzaaj(str, str2).zza(iVar));
    }

    public final Task<Object> zzb(i iVar, String str, String str2) {
        return zza((zzaam) new zzaam(str, str2).zza(iVar));
    }

    public final Task<Object> zzc(i iVar, String str, String str2) {
        return zza((zzaaq) new zzaaq(str, str2).zza(iVar));
    }

    public final Task<Void> zzd(i iVar, l lVar, String str, p pVar) {
        return zza((zzaca) new zzaca(str).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, String str, String str2, String str3) {
        return zza((zzaal) new zzaal(str, str2, str3).zza(iVar));
    }

    public final Task<Void> zzb(i iVar, String str, a aVar, String str2, String str3) {
        aVar.B = 6;
        return zza((zzabj) new zzabj(str, aVar, str2, str3, "sendSignInLinkToEmail").zza(iVar));
    }

    public final Task<x> zzc(i iVar, l lVar, c cVar, String str, p pVar) {
        return zza((zzaaz) new zzaaz(cVar, str).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
    }

    public final Task<x> zza(i iVar, String str, String str2, String str3, String str4, s sVar) {
        return zza((zzaao) new zzaao(str, str2, str3, str4).zza(iVar).zza((zzacz<x, s>) sVar));
    }

    public final Task<String> zzd(i iVar, String str, String str2) {
        return zza((zzace) new zzace(str, str2).zza(iVar));
    }

    public final Task<Void> zzb(i iVar, l lVar, c cVar, String str, p pVar) {
        return zza((zzaba) new zzaba(cVar, str).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zzc(i iVar, l lVar, String str, p pVar) {
        return zza((zzabx) new zzabx(str).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(l lVar, jg.i iVar) {
        return zza((zzaan) new zzaan().zza(lVar).zza((zzacz<Void, jg.i>) iVar).zza((h) iVar));
    }

    public final Task<x> zzb(i iVar, l lVar, d dVar, String str, p pVar) {
        return zza((zzabb) new zzabb(dVar, str).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, u uVar, l lVar, String str, s sVar) {
        zzads.zza();
        zzaap zzaapVar = new zzaap(uVar, ((jg.d) lVar).f8872a.zzf(), str, null);
        zzaapVar.zza(iVar).zza((zzacz<Void, s>) sVar);
        return zza(zzaapVar);
    }

    public final Task<x> zzb(i iVar, l lVar, String str, String str2, String str3, String str4, p pVar) {
        return zza((zzabd) new zzabd(str, str2, str3, str4).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, ig.x xVar, l lVar, String str, String str2, s sVar) {
        zzaap zzaapVar = new zzaap(xVar, ((jg.d) lVar).f8872a.zzf(), str, str2);
        zzaapVar.zza(iVar).zza((zzacz<Void, s>) sVar);
        return zza(zzaapVar);
    }

    public final Task<x> zzb(i iVar, l lVar, r rVar, String str, p pVar) {
        zzads.zza();
        return zza((zzabf) new zzabf(rVar, str).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
    }

    public final Task<x> zza(i iVar, l lVar, u uVar, String str, s sVar) {
        zzads.zza();
        zzaas zzaasVar = new zzaas(uVar, str, null);
        zzaasVar.zza(iVar).zza((zzacz<x, s>) sVar);
        if (lVar != null) {
            zzaasVar.zza(lVar);
        }
        return zza(zzaasVar);
    }

    public final Task<x> zzb(i iVar, String str, String str2, String str3, String str4, s sVar) {
        return zza((zzabq) new zzabq(str, str2, str3, str4).zza(iVar).zza((zzacz<x, s>) sVar));
    }

    public final Task<x> zza(i iVar, l lVar, ig.x xVar, String str, String str2, s sVar) {
        zzaas zzaasVar = new zzaas(xVar, str, str2);
        zzaasVar.zza(iVar).zza((zzacz<x, s>) sVar);
        if (lVar != null) {
            zzaasVar.zza(lVar);
        }
        return zza(zzaasVar);
    }

    public final Task<x> zzb(i iVar, l lVar, String str, p pVar) {
        e0.i(iVar);
        e0.e(str);
        e0.i(lVar);
        e0.i(pVar);
        ArrayList arrayList = ((jg.d) lVar).f8877f;
        if ((arrayList != null && !arrayList.contains(str)) || lVar.c()) {
            return Tasks.forException(zzach.zza(new Status(17016, str, null, null)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzaby) new zzaby(str).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
        }
        return zza((zzabv) new zzabv().zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, String str, a aVar, String str2, String str3) {
        aVar.B = 1;
        return zza((zzabj) new zzabj(str, aVar, str2, str3, "sendPasswordResetEmail").zza(iVar));
    }

    public final Task<Void> zza(String str, String str2, a aVar) {
        aVar.B = 7;
        return zza(new zzacb(str, str2, aVar));
    }

    public final Task<m> zza(i iVar, l lVar, String str, p pVar) {
        return zza((zzaar) new zzaar(str).zza(iVar).zza(lVar).zza((zzacz<m, s>) pVar).zza((h) pVar));
    }

    public final Task<zzafi> zza() {
        return zza(new zzaau());
    }

    public final Task<zzafn> zza(String str, String str2) {
        return zza(new zzaat(str, str2));
    }

    public final Task<x> zza(i iVar, l lVar, c cVar, String str, p pVar) {
        e0.i(iVar);
        e0.i(cVar);
        e0.i(lVar);
        e0.i(pVar);
        ArrayList arrayList = ((jg.d) lVar).f8877f;
        if (arrayList != null && arrayList.contains(cVar.b())) {
            return Tasks.forException(zzach.zza(new Status(17015, null, null, null)));
        }
        if (cVar instanceof d) {
            d dVar = (d) cVar;
            if (TextUtils.isEmpty(dVar.f8531c)) {
                return zza((zzaaw) new zzaaw(dVar, str).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
            }
            return zza((zzaax) new zzaax(dVar).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
        }
        if (cVar instanceof r) {
            zzads.zza();
            return zza((zzaay) new zzaay((r) cVar).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
        }
        return zza((zzaav) new zzaav(cVar).zza(iVar).zza(lVar).zza((zzacz<x, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, l lVar, d dVar, String str, p pVar) {
        return zza((zzabc) new zzabc(dVar, str).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, l lVar, String str, String str2, String str3, String str4, p pVar) {
        return zza((zzabe) new zzabe(str, str2, str3, str4).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, l lVar, r rVar, String str, p pVar) {
        zzads.zza();
        return zza((zzabg) new zzabg(rVar, str).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, l lVar, p pVar) {
        return zza((zzabi) new zzabi().zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzabh(str, str2, str3, str4));
    }

    public final Task<Void> zza(i iVar, a aVar, String str) {
        return zza((zzabk) new zzabk(str, aVar).zza(iVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzabm(str));
    }

    public final Task<x> zza(i iVar, s sVar, String str) {
        return zza((zzabl) new zzabl(str).zza(iVar).zza((zzacz<x, s>) sVar));
    }

    public final Task<x> zza(i iVar, c cVar, String str, s sVar) {
        return zza((zzabo) new zzabo(cVar, str).zza(iVar).zza((zzacz<x, s>) sVar));
    }

    public final Task<x> zza(i iVar, String str, String str2, s sVar) {
        return zza((zzabn) new zzabn(str, str2).zza(iVar).zza((zzacz<x, s>) sVar));
    }

    public final Task<x> zza(i iVar, d dVar, String str, s sVar) {
        return zza((zzabp) new zzabp(dVar, str).zza(iVar).zza((zzacz<x, s>) sVar));
    }

    public final Task<x> zza(i iVar, r rVar, String str, s sVar) {
        zzads.zza();
        return zza((zzabs) new zzabs(rVar, str).zza(iVar).zza((zzacz<x, s>) sVar));
    }

    public final Task<Void> zza(f fVar, String str, String str2, long j, boolean z2, boolean z10, String str3, String str4, boolean z11, t tVar, Executor executor, Activity activity) {
        zzabr zzabrVar = new zzabr(fVar, str, str2, j, z2, z10, str3, str4, z11);
        zzabrVar.zza(tVar, activity, executor, str);
        return zza(zzabrVar);
    }

    public final Task<zzagi> zza(f fVar, String str) {
        return zza(new zzabu(fVar, str));
    }

    public final Task<Void> zza(f fVar, v vVar, String str, long j, boolean z2, boolean z10, String str2, String str3, boolean z11, t tVar, Executor executor, Activity activity) {
        String str4 = fVar.f8882b;
        e0.e(str4);
        zzabt zzabtVar = new zzabt(vVar, str4, str, j, z2, z10, str2, str3, z11);
        zzabtVar.zza(tVar, activity, executor, vVar.f8564a);
        return zza(zzabtVar);
    }

    public final Task<Void> zza(i iVar, l lVar, String str, String str2, p pVar) {
        return zza((zzabw) new zzabw(((jg.d) lVar).f8872a.zzf(), str, str2).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, l lVar, r rVar, p pVar) {
        zzads.zza();
        return zza((zzabz) new zzabz(rVar).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public final Task<Void> zza(i iVar, l lVar, b0 b0Var, p pVar) {
        return zza((zzacc) new zzacc(b0Var).zza(iVar).zza(lVar).zza((zzacz<Void, s>) pVar).zza((h) pVar));
    }

    public static jg.d zza(i iVar, zzaff zzaffVar) {
        e0.i(iVar);
        e0.i(zzaffVar);
        ArrayList arrayList = new ArrayList();
        y yVar = new y();
        e0.e("firebase");
        String strZzi = zzaffVar.zzi();
        e0.e(strZzi);
        yVar.f8920a = strZzi;
        yVar.f8921b = "firebase";
        yVar.f8924e = zzaffVar.zzh();
        yVar.f8922c = zzaffVar.zzg();
        Uri uriZzc = zzaffVar.zzc();
        if (uriZzc != null) {
            yVar.f8923d = uriZzc.toString();
        }
        yVar.f8926z = zzaffVar.zzm();
        yVar.A = null;
        yVar.f8925f = zzaffVar.zzj();
        arrayList.add(yVar);
        List<zzafv> listZzl = zzaffVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i10 = 0; i10 < listZzl.size(); i10++) {
                zzafv zzafvVar = listZzl.get(i10);
                y yVar2 = new y();
                e0.i(zzafvVar);
                yVar2.f8920a = zzafvVar.zzd();
                String strZzf = zzafvVar.zzf();
                e0.e(strZzf);
                yVar2.f8921b = strZzf;
                yVar2.f8922c = zzafvVar.zzb();
                Uri uriZza = zzafvVar.zza();
                if (uriZza != null) {
                    yVar2.f8923d = uriZza.toString();
                }
                yVar2.f8924e = zzafvVar.zzc();
                yVar2.f8925f = zzafvVar.zze();
                yVar2.f8926z = false;
                yVar2.A = zzafvVar.zzg();
                arrayList.add(yVar2);
            }
        }
        jg.d dVar = new jg.d(iVar, arrayList);
        dVar.B = new e(zzaffVar.zzb(), zzaffVar.zza());
        dVar.C = zzaffVar.zzn();
        dVar.D = zzaffVar.zze();
        dVar.e(x8.a.b0(zzaffVar.zzk()));
        List listZzd = zzaffVar.zzd();
        if (listZzd == null) {
            listZzd = new ArrayList();
        }
        dVar.F = listZzd;
        return dVar;
    }

    public final void zza(i iVar, zzagd zzagdVar, t tVar, Activity activity, Executor executor) {
        zza((zzacd) new zzacd(zzagdVar).zza(iVar).zza(tVar, activity, executor, zzagdVar.zzd()));
    }
}
