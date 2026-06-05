package g;

import c.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends cg.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f6842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f6844g;

    public /* synthetic */ f(l lVar, String str, v vVar, int i10) {
        this.f6841d = i10;
        this.f6842e = lVar;
        this.f6843f = str;
        this.f6844g = vVar;
    }

    public final void a0(Object obj) {
        switch (this.f6841d) {
            case 0:
                l lVar = this.f6842e;
                LinkedHashMap linkedHashMap = lVar.f1833b;
                ArrayList arrayList = lVar.f1835d;
                String str = this.f6843f;
                Object obj2 = linkedHashMap.get(str);
                h.b bVar = (h.b) this.f6844g;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + bVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    lVar.b(iIntValue, bVar, obj);
                    return;
                } catch (Exception e10) {
                    arrayList.remove(str);
                    throw e10;
                }
            default:
                l lVar2 = this.f6842e;
                ArrayList arrayList2 = lVar2.f1835d;
                LinkedHashMap linkedHashMap2 = lVar2.f1833b;
                String str2 = this.f6843f;
                Object obj3 = linkedHashMap2.get(str2);
                v vVar = this.f6844g;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + vVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    lVar2.b(iIntValue2, vVar, obj);
                    return;
                } catch (Exception e11) {
                    arrayList2.remove(str2);
                    throw e11;
                }
        }
    }

    public void b0() {
        this.f6842e.e(this.f6843f);
    }
}
