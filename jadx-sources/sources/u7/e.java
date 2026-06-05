package u7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import t7.m;
import t7.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends mk.b {

    /* renamed from: g, reason: collision with root package name */
    public static final String f16819g = m.l("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    public final k f16820b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16821c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16822d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f16823e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f16824f;

    public e(k kVar, List list) {
        this.f16820b = kVar;
        this.f16821c = list;
        this.f16822d = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = ((n) list.get(i10)).f16124a.toString();
            this.f16822d.add(string);
            this.f16823e.add(string);
        }
    }

    public static HashSet U(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
