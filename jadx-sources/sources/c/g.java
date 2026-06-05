package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tj.r0;
import w5.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements a7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1820b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f1819a = i10;
        this.f1820b = obj;
    }

    @Override // a7.d
    public final Bundle a() {
        pi.h[] hVarArr;
        i0 i0Var;
        int i10 = this.f1819a;
        Object obj = this.f1820b;
        switch (i10) {
            case 0:
                Bundle bundle = new Bundle();
                l lVar = ((m) obj).B;
                lVar.getClass();
                LinkedHashMap linkedHashMap = lVar.f1833b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lVar.f1835d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar.f1838g));
                return bundle;
            case 1:
                ak.v vVar = (ak.v) obj;
                for (Map.Entry entry : qi.v.m0((LinkedHashMap) vVar.f733d).entrySet()) {
                    vVar.E(((r0) ((tj.b0) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : qi.v.m0((LinkedHashMap) vVar.f731b).entrySet()) {
                    vVar.E(((a7.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) vVar.f730a;
                if (linkedHashMap2.isEmpty()) {
                    hVarArr = new pi.h[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        arrayList.add(new pi.h((String) entry3.getKey(), entry3.getValue()));
                    }
                    hVarArr = (pi.h[]) arrayList.toArray(new pi.h[0]);
                }
                return uk.c.m((pi.h[]) Arrays.copyOf(hVarArr, hVarArr.length));
            case 2:
                Map mapC = ((s1.f) obj).c();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : mapC.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 3:
                w5.w wVar = (w5.w) obj;
                do {
                    i0Var = ((w5.v) wVar.M.f449b).f18779z;
                    androidx.lifecycle.o oVar = androidx.lifecycle.o.f1111a;
                } while (w5.w.n(i0Var));
                wVar.N.d(androidx.lifecycle.n.ON_STOP);
                return new Bundle();
            default:
                return ((i0) obj).W();
        }
    }
}
