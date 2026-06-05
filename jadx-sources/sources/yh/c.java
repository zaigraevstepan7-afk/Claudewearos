package yh;

import ag.j;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import ce.y;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g1.e;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import mg.d;
import mg.l;
import pi.o;
import q.x;
import qj.k;
import rg.h;
import t.a0;
import t.c0;
import t.q;
import t6.f0;
import t6.k0;
import t6.t0;
import w5.e0;
import w5.i0;
import x.g;
import yd.f;
import zg.p;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements j, t, Continuation, OnCompleteListener, l, q, g.b, xg.b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f20312c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20313a;

    /* renamed from: b, reason: collision with root package name */
    public Object f20314b;

    public /* synthetic */ c(int i10, boolean z2) {
        this.f20313a = i10;
    }

    public void A(String str, String str2) {
        ak.l.a(str);
        ak.l.b(str2, str);
        x(str);
        a(str, str2);
    }

    public synchronized boolean B(long j) {
        if (!((SharedPreferences) this.f20314b).contains("fire-global")) {
            ((SharedPreferences) this.f20314b).edit().putLong("fire-global", j).commit();
            return true;
        }
        long j4 = ((SharedPreferences) this.f20314b).getLong("fire-global", -1L);
        synchronized (this) {
            if (r(j4).equals(r(j))) {
                return false;
            }
            ((SharedPreferences) this.f20314b).edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public synchronized void C(long j, String str) {
        String strR = r(j);
        if (((SharedPreferences) this.f20314b).getString("last-used-date", "").equals(strR)) {
            String strS = s(strR);
            if (strS == null) {
                return;
            }
            if (strS.equals(str)) {
                return;
            }
            D(str, strR);
            return;
        }
        long j4 = ((SharedPreferences) this.f20314b).getLong("fire-count", 0L);
        if (j4 + 1 == 30) {
            j();
            j4 = ((SharedPreferences) this.f20314b).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.f20314b).getStringSet(str, new HashSet()));
        hashSet.add(strR);
        ((SharedPreferences) this.f20314b).edit().putStringSet(str, hashSet).putLong("fire-count", j4 + 1).putString("last-used-date", strR).commit();
    }

    public synchronized void D(String str, String str2) {
        y(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.f20314b).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.f20314b).edit().putStringSet(str, hashSet).commit();
    }

    public void a(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.f20314b;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    @Override // com.google.android.gms.common.api.internal.t
    public void accept(Object obj, Object obj2) {
        switch (this.f20313a) {
            case 3:
                ((zzs) ((zzp) obj).getService()).zzc(new be.b((TaskCompletionSource) obj2), (y) this.f20314b);
                break;
            default:
                pd.a aVar = (pd.a) ((pd.c) obj).getService();
                u uVar = (u) this.f20314b;
                Parcel parcelZaa = aVar.zaa();
                zac.zac(parcelZaa, uVar);
                aVar.zad(1, parcelZaa);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
        }
    }

    @Override // g.b
    public void b(Object obj) {
        switch (this.f20313a) {
            case 23:
                g.a aVar = (g.a) obj;
                i0 i0Var = (i0) this.f20314b;
                e0 e0Var = (e0) i0Var.F.pollLast();
                if (e0Var != null) {
                    String str = e0Var.f18625a;
                    int i10 = e0Var.f18626b;
                    w5.t tVarV = i0Var.f18643c.v(str);
                    if (tVarV != null) {
                        tVarV.u(i10, aVar.f6831a, aVar.f6832b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f20314b;
                g.a aVar2 = (g.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f6832b;
                int i11 = zze.zzf(intent, "ProxyBillingActivityV2").f18942a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.f6831a;
                if (i12 != -1 || i11 != 0) {
                    zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // mg.l
    public void c(mg.b bVar) {
        fj.l.f(bVar, "error");
    }

    public void d(CancellationException cancellationException) {
        e eVar = (e) this.f20314b;
        int i10 = eVar.f7026c;
        k[] kVarArr = new k[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            kVarArr[i11] = ((g) eVar.f7024a[i11]).f19529b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            kVarArr[i12].x(cancellationException);
        }
        if (eVar.f7026c == 0) {
            return;
        }
        a0.a.c("uncancelled requests present");
    }

    @Override // xg.b
    public boolean f() {
        return false;
    }

    @Override // xg.b
    public zg.l g(zg.l lVar, r rVar) {
        return lVar.f20605a.isEmpty() ? lVar : new zg.l(lVar.f20605a.m(rVar), lVar.f20607c, lVar.f20606b);
    }

    @Override // t.q
    public a0 get(int i10) {
        return ((c0[]) this.f20314b)[i10];
    }

    @Override // xg.b
    public zg.k getIndex() {
        return (zg.k) this.f20314b;
    }

    @Override // xg.b
    public zg.l h(zg.l lVar, zg.c cVar, r rVar, h hVar, xg.a aVar, rg.a aVar2) {
        ug.l.b("The index must match the filter", lVar.f20607c == ((zg.k) this.f20314b));
        r rVar2 = lVar.f20605a;
        r rVarT = rVar2.t(cVar);
        if (!rVarT.l(hVar).equals(rVar.l(hVar)) || rVarT.isEmpty() != rVar.isEmpty()) {
            if (aVar2 != null) {
                if (rVar.isEmpty()) {
                    if (rVar2.h(cVar)) {
                        aVar2.b(new wg.c(1, zg.l.e(rVarT), cVar, null));
                    } else {
                        ug.l.b("A child remove without an old child only makes sense on a leaf node", rVar2.n());
                    }
                } else if (rVarT.isEmpty()) {
                    aVar2.b(new wg.c(2, zg.l.e(rVar), cVar, null));
                } else {
                    aVar2.b(new wg.c(4, zg.l.e(rVar), cVar, zg.l.e(rVarT)));
                }
            }
            if (!rVar2.n() || !rVar.isEmpty()) {
                return lVar.i(cVar, rVar);
            }
        }
        return lVar;
    }

    @Override // xg.b
    public zg.l i(zg.l lVar, zg.l lVar2, rg.a aVar) {
        boolean z2 = lVar2.f20607c == ((zg.k) this.f20314b);
        r<p> rVar = lVar2.f20605a;
        ug.l.b("Can't use IndexedNode that doesn't have filter's index", z2);
        if (aVar != null) {
            r<p> rVar2 = lVar.f20605a;
            for (p pVar : rVar2) {
                if (!rVar.h(pVar.f20614a)) {
                    aVar.b(new wg.c(1, zg.l.e(pVar.f20615b), pVar.f20614a, null));
                }
            }
            if (!rVar.n()) {
                for (p pVar2 : rVar) {
                    zg.c cVar = pVar2.f20614a;
                    r rVar3 = pVar2.f20615b;
                    if (rVar2.h(cVar)) {
                        r rVarT = rVar2.t(cVar);
                        if (!rVarT.equals(rVar3)) {
                            aVar.b(new wg.c(4, zg.l.e(rVar3), cVar, zg.l.e(rVarT)));
                        }
                    } else {
                        aVar.b(new wg.c(2, zg.l.e(rVar3), cVar, null));
                    }
                }
            }
        }
        return lVar2;
    }

    public synchronized void j() {
        try {
            long j = ((SharedPreferences) this.f20314b).getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f20314b).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f20314b).getStringSet(key, new HashSet()));
            hashSet.remove(str);
            ((SharedPreferences) this.f20314b).edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k(ak.c0 c0Var) {
        ((LinkedHashSet) this.f20314b).remove(c0Var);
    }

    public synchronized void l() {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f20314b).edit();
            int i10 = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f20314b).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strR = r(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strR)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strR);
                        i10++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i10 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i10);
            }
            editorEdit.commit();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void m(t6.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f20314b;
        int i10 = aVar.f15819a;
        if (i10 == 1) {
            recyclerView.E.X(aVar.f15820b, aVar.f15821c);
            return;
        }
        if (i10 == 2) {
            recyclerView.E.a0(aVar.f15820b, aVar.f15821c);
        } else if (i10 == 4) {
            recyclerView.E.b0(aVar.f15820b, aVar.f15821c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.E.Z(aVar.f15820b, aVar.f15821c);
        }
    }

    @Override // mg.l
    public void n(mg.a aVar) {
        t1.q qVar = (t1.q) this.f20314b;
        qVar.clear();
        Iterator it = aVar.f11667a.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            d dVarB = aVar.f11668b.b(pVar.f20614a.f20592a);
            mg.a aVar2 = new mg.a(dVarB, zg.l.e(pVar.f20615b));
            String strD = dVarB.d();
            if (strD != null) {
                mg.a aVarA = aVar2.a("timestamp");
                Class cls = Long.TYPE;
                Long l10 = (Long) aVarA.c(cls);
                long jLongValue = l10 != null ? l10.longValue() : 0L;
                String str = (String) aVar2.a("content").c(String.class);
                if (str == null) {
                    str = "";
                }
                String str2 = (String) aVar2.a("imageUrl").c(String.class);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                mg.a aVarA2 = aVar2.a("reactions");
                Iterator it2 = aVarA2.f11667a.iterator();
                while (it2.hasNext()) {
                    p pVar2 = (p) it2.next();
                    d dVarB2 = aVarA2.f11668b.b(pVar2.f20614a.f20592a);
                    zg.l lVarE = zg.l.e(pVar2.f20615b);
                    String strD2 = dVarB2.d();
                    if (strD2 != null) {
                        Object value = lVarE.f20605a.getValue();
                        long jLongValue2 = value instanceof Long ? ((Number) value).longValue() : value instanceof Integer ? ((Number) value).intValue() : 0L;
                        if (jLongValue2 > 0) {
                            linkedHashMap.put(strD2, Long.valueOf(jLongValue2));
                        }
                    }
                }
                Long l11 = (Long) aVar2.a("views").c(cls);
                qVar.add(new ra.c(strD, jLongValue, str, str2, linkedHashMap, l11 != null ? l11.longValue() : 0L));
            }
        }
    }

    public t0 o(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f20314b;
        int iV = recyclerView.f1181e.v();
        int i11 = 0;
        t0 t0Var = null;
        while (true) {
            if (i11 >= iV) {
                break;
            }
            t0 t0VarH = RecyclerView.H(recyclerView.f1181e.u(i11));
            if (t0VarH != null && !t0VarH.h() && t0VarH.f16048c == i10) {
                if (!((ArrayList) recyclerView.f1181e.f12662d).contains(t0VarH.f16046a)) {
                    t0Var = t0VarH;
                    break;
                }
                t0Var = t0VarH;
            }
            i11++;
        }
        if (t0Var != null) {
            if (!((ArrayList) recyclerView.f1181e.f12662d).contains(t0Var.f16046a)) {
                return t0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f20313a) {
            case 10:
                ((CountDownLatch) this.f20314b).countDown();
                break;
            default:
                qj.l lVar = (qj.l) this.f20314b;
                Exception exception = task.getException();
                if (exception != null) {
                    lVar.resumeWith(uk.c.r(exception));
                    break;
                } else if (!task.isCanceled()) {
                    lVar.resumeWith(task.getResult());
                    break;
                } else {
                    lVar.x(null);
                    break;
                }
        }
    }

    public synchronized ArrayList p() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f20314b).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(r(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new lh.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.f20314b).edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @Override // ag.j
    public Object q(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            Provider provider = Security.getProvider(strArr[i11]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            try {
                return ((ag.l) this.f20314b).b(str, (Provider) obj);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public synchronized String r(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public synchronized String s(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f20314b).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public void t(int i10, int i11) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f20314b;
        int iV = recyclerView.f1181e.v();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iV; i15++) {
            View viewU = recyclerView.f1181e.u(i15);
            t0 t0VarH = RecyclerView.H(viewU);
            if (t0VarH != null && !t0VarH.o() && (i13 = t0VarH.f16048c) >= i10 && i13 < i14) {
                t0VarH.a(2);
                t0VarH.a(1024);
                ((f0) viewU.getLayoutParams()).f15895c = true;
            }
        }
        k0 k0Var = recyclerView.f1175b;
        ArrayList arrayList = k0Var.f15950c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t0 t0Var = (t0) arrayList.get(size);
            if (t0Var != null && (i12 = t0Var.f16048c) >= i10 && i12 < i14) {
                t0Var.a(2);
                k0Var.f(size);
            }
        }
        recyclerView.A0 = true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        f fVar = (f) this.f20314b;
        if (task.isSuccessful()) {
            return fVar.p0((String) task.getResult());
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.e0.i(exception);
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception.getMessage() + "\n\n Failing open with a fake token.");
        return fVar.p0("NO_RECAPTCHA");
    }

    public void u(View view, int i10, boolean z2) {
        ((AutofillManager) this.f20314b).notifyViewVisibilityChanged(view, i10, z2);
    }

    public void v(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f20314b;
        int iV = recyclerView.f1181e.v();
        for (int i12 = 0; i12 < iV; i12++) {
            t0 t0VarH = RecyclerView.H(recyclerView.f1181e.u(i12));
            if (t0VarH != null && !t0VarH.o() && t0VarH.f16048c >= i10) {
                t0VarH.l(i11, false);
                recyclerView.w0.f16001f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1175b.f15950c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            t0 t0Var = (t0) arrayList.get(i13);
            if (t0Var != null && t0Var.f16048c >= i10) {
                t0Var.l(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.z0 = true;
    }

    public void w(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f20314b;
        int iV = recyclerView.f1181e.v();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iV; i20++) {
            t0 t0VarH = RecyclerView.H(recyclerView.f1181e.u(i20));
            if (t0VarH != null && (i18 = t0VarH.f16048c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    t0VarH.l(i11 - i10, false);
                } else {
                    t0VarH.l(i14, false);
                }
                recyclerView.w0.f16001f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1175b.f15950c;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            t0 t0Var = (t0) arrayList.get(i21);
            if (t0Var != null && (i17 = t0Var.f16048c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    t0Var.l(i11 - i10, false);
                } else {
                    t0Var.l(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.z0 = true;
    }

    public void x(String str) {
        ArrayList arrayList = (ArrayList) this.f20314b;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public synchronized void y(String str) {
        try {
            String strS = s(str);
            if (strS == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f20314b).getStringSet(strS, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                ((SharedPreferences) this.f20314b).edit().remove(strS).commit();
            } else {
                ((SharedPreferences) this.f20314b).edit().putStringSet(strS, hashSet).commit();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void z() {
        e eVar = (e) this.f20314b;
        kj.h hVarT = cg.b.T(0, eVar.f7026c);
        int i10 = hVarT.f9665a;
        int i11 = hVarT.f9666b;
        if (i10 <= i11) {
            while (true) {
                ((g) eVar.f7024a[i10]).f19529b.resumeWith(o.f13011a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        eVar.h();
    }

    public /* synthetic */ c(be.a aVar, y yVar) {
        this.f20313a = 3;
        this.f20314b = yVar;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f20313a = i10;
        this.f20314b = obj;
    }

    public c(int i10) {
        this.f20313a = i10;
        switch (i10) {
            case 2:
                this.f20314b = new ArrayList(20);
                break;
            case 5:
                this.f20314b = new LinkedHashSet();
                break;
            case 25:
                this.f20314b = new e(new g[16]);
                break;
            default:
                this.f20314b = new HashSet();
                break;
        }
    }

    public c(Context context, String str) {
        this.f20313a = 8;
        this.f20314b = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public c(EditText editText) {
        this.f20313a = 19;
        this.f20314b = new qh.c(editText);
    }

    public c(long[] jArr) {
        x xVar;
        this.f20313a = 18;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            xVar = new x(jArrCopyOf.length);
            int i10 = xVar.f13145b;
            if (i10 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i10;
                    long[] jArr2 = xVar.f13144a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        fj.l.e(jArrCopyOf2, "copyOf(...)");
                        xVar.f13144a = jArrCopyOf2;
                    }
                    long[] jArr3 = xVar.f13144a;
                    int i11 = xVar.f13145b;
                    if (i10 != i11) {
                        qi.k.h0(jArr3, jArr3, jArrCopyOf.length + i10, i10, i11);
                    }
                    qi.k.h0(jArrCopyOf, jArr3, i10, 0, jArrCopyOf.length);
                    xVar.f13145b += jArrCopyOf.length;
                }
            } else {
                r.a.d("");
                throw null;
            }
        } else {
            xVar = new x();
        }
        this.f20314b = xVar;
    }

    public c(float f10, float f11, t.p pVar) {
        this.f20313a = 17;
        int iB = pVar.b();
        c0[] c0VarArr = new c0[iB];
        for (int i10 = 0; i10 < iB; i10++) {
            c0VarArr[i10] = new c0(f10, f11, pVar.a(i10));
        }
        this.f20314b = c0VarArr;
    }

    @Override // xg.b
    public c e() {
        return this;
    }
}
