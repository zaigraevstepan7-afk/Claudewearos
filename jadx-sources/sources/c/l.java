package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1832a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1833b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1834c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1835d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1836e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1837f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1838g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f1839h;

    public l(m mVar) {
        this.f1839h = mVar;
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f1832a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g.d dVar = (g.d) this.f1836e.get(str);
        if ((dVar != null ? dVar.f6837a : null) != null) {
            ArrayList arrayList = this.f1835d;
            if (arrayList.contains(str)) {
                dVar.f6837a.b(dVar.f6838b.S(i11, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1837f.remove(str);
        this.f1838g.putParcelable(str, new g.a(i11, intent));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i10, u6.v vVar, Object obj) {
        Bundle bundleExtra;
        int i11;
        m mVar = this.f1839h;
        h.a aVarJ = vVar.J(mVar, obj);
        if (aVarJ != null) {
            new Handler(Looper.getMainLooper()).post(new k(this, i10, 0, aVarJ));
            return;
        }
        Intent intentT = vVar.t(mVar, obj);
        if (intentT.getExtras() != null) {
            Bundle extras = intentT.getExtras();
            fj.l.c(extras);
            if (extras.getClassLoader() == null) {
                intentT.setExtrasClassLoader(mVar.getClassLoader());
            }
        }
        if (intentT.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentT.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentT.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentT.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentT.getAction())) {
                mVar.startActivityForResult(intentT, i10, bundle);
                return;
            }
            g.h hVar = (g.h) intentT.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                fj.l.c(hVar);
                i11 = i10;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i11 = i10;
            }
            try {
                mVar.startIntentSenderForResult(hVar.f6845a, i11, hVar.f6846b, hVar.f6847c, hVar.f6848d, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                new Handler(Looper.getMainLooper()).post(new k(this, i11, 1, e));
                return;
            }
        }
        String[] stringArrayExtra = intentT.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
            if (TextUtils.isEmpty(stringArrayExtra[i12])) {
                throw new IllegalArgumentException(m6.a.j(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i12], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i12));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < stringArrayExtra.length; i14++) {
                if (!hashSet.contains(Integer.valueOf(i14))) {
                    strArr[i13] = stringArrayExtra[i14];
                    i13++;
                }
            }
        }
        if (mVar instanceof h4.a) {
        }
        mVar.requestPermissions(stringArrayExtra, i10);
    }

    public final g.f c(String str, u6.v vVar, g.b bVar) {
        fj.l.f(str, "key");
        d(str);
        this.f1836e.put(str, new g.d(bVar, vVar));
        LinkedHashMap linkedHashMap = this.f1837f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.b(obj);
        }
        Bundle bundle = this.f1838g;
        g.a aVar = (g.a) u6.v.H(bundle, str);
        if (aVar != null) {
            bundle.remove(str);
            bVar.b(vVar.S(aVar.f6831a, aVar.f6832b));
        }
        return new g.f(this, str, vVar, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.f1833b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        fa.a aVar = new fa.a(7);
        Iterator it = new mj.a(new mj.d(1, new ab.k(aVar, 26), aVar)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f1832a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        fj.l.f(str, "key");
        if (!this.f1835d.contains(str) && (num = (Integer) this.f1833b.remove(str)) != null) {
            this.f1832a.remove(num);
        }
        this.f1836e.remove(str);
        LinkedHashMap linkedHashMap = this.f1837f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbK = m6.a.k("Dropping pending result for request ", str, ": ");
            sbK.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbK.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f1838g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((g.a) u6.v.H(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f1834c;
        g.e eVar = (g.e) linkedHashMap2.get(str);
        if (eVar != null) {
            ArrayList arrayList = eVar.f6840b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                eVar.f6839a.f((androidx.lifecycle.r) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
