package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1822b;

    public /* synthetic */ h(m mVar, int i10) {
        this.f1821a = i10;
        this.f1822b = mVar;
    }

    public final void a(m mVar) {
        switch (this.f1821a) {
            case 0:
                fj.l.f(mVar, "it");
                m mVar2 = this.f1822b;
                Bundle bundleI = ((mh.g) mVar2.f1843d.f15364c).i("android:support:activity-result");
                if (bundleI != null) {
                    l lVar = mVar2.B;
                    LinkedHashMap linkedHashMap = lVar.f1833b;
                    LinkedHashMap linkedHashMap2 = lVar.f1832a;
                    Bundle bundle = lVar.f1838g;
                    ArrayList<Integer> integerArrayList = bundleI.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleI.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleI.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            lVar.f1835d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleI.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            String str = stringArrayList.get(i10);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    fj.y.b(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i10);
                            fj.l.e(num2, "get(...)");
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i10);
                            fj.l.e(str2, "get(...)");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            lVar.f1833b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                w5.v vVar = (w5.v) ((w5.w) this.f1822b).M.f449b;
                vVar.f18779z.b(vVar, vVar, null);
                break;
        }
    }
}
