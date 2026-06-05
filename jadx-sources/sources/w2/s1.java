package w2;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.play_billing.zze;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s1 implements q1.d, g.b, zzgch, y.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18373a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18374b;

    public /* synthetic */ s1(Object obj, int i10) {
        this.f18373a = i10;
        this.f18374b = obj;
    }

    @Override // y.b
    public Object a(x.s1 s1Var, Float f10, Float f11, ej.c cVar, y.f fVar) {
        Object objA = y.k.a(s1Var, f10.floatValue(), t.d.b(0.0f, f11.floatValue(), 28), (t.u) this.f18374b, cVar, fVar);
        return objA == ui.a.f17085a ? objA : (y.a) objA;
    }

    @Override // g.b
    public void b(Object obj) {
        switch (this.f18373a) {
            case 1:
                g.a aVar = (g.a) obj;
                w5.i0 i0Var = (w5.i0) this.f18374b;
                w5.e0 e0Var = (w5.e0) i0Var.F.pollFirst();
                if (e0Var != null) {
                    String str = e0Var.f18625a;
                    int i10 = e0Var.f18626b;
                    w5.t tVarV = i0Var.f18643c.v(str);
                    if (tVarV != null) {
                        tVarV.u(i10, aVar.f6831a, aVar.f6832b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f18374b;
                g.a aVar2 = (g.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f6832b;
                int i11 = zze.zzf(intent, "ProxyBillingActivityV2").f18942a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.P;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.f6831a;
                if (i12 != -1 || i11 != 0) {
                    zze.zzl("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgch
    public mf.a zza() {
        xc.l lVar = (xc.l) this.f18374b;
        return lVar.n(lVar.f19962b, null, "BANNER", null, null, 0, null, new Bundle(), null).zzb();
    }

    public s1() {
        this.f18373a = 0;
        q1.c cVar = new q1.c();
        this.f18374b = cVar;
        if (cVar.f13177b) {
            return;
        }
        if (cVar.f13178c) {
            r1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        cVar.a();
        cVar.f13178c = true;
    }
}
