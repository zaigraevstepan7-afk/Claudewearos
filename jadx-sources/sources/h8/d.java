package h8;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f7691a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7692b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7693c;

    /* renamed from: d, reason: collision with root package name */
    public List f7694d;

    /* renamed from: e, reason: collision with root package name */
    public List f7695e;

    /* renamed from: f, reason: collision with root package name */
    public final pi.m f7696f;

    /* renamed from: g, reason: collision with root package name */
    public final pi.m f7697g;

    public d(List list, List list2, List list3, List list4, List list5) {
        this.f7691a = list;
        this.f7692b = list2;
        this.f7693c = list3;
        this.f7694d = list4;
        this.f7695e = list5;
        final int i10 = 0;
        this.f7696f = u6.v.Q(new ej.a(this) { // from class: h8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f7688b;

            {
                this.f7688b = this;
            }

            @Override // ej.a
            public final Object a() {
                switch (i10) {
                    case 0:
                        d dVar = this.f7688b;
                        List list6 = dVar.f7694d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            qi.q.u0(arrayList, (List) ((ej.a) list6.get(i11)).a());
                        }
                        dVar.f7694d = qi.s.f13520a;
                        return arrayList;
                    default:
                        d dVar2 = this.f7688b;
                        List list7 = dVar2.f7695e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            qi.q.u0(arrayList2, (List) ((ej.a) list7.get(i12)).a());
                        }
                        dVar2.f7695e = qi.s.f13520a;
                        return arrayList2;
                }
            }
        });
        final int i11 = 1;
        this.f7697g = u6.v.Q(new ej.a(this) { // from class: h8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f7688b;

            {
                this.f7688b = this;
            }

            @Override // ej.a
            public final Object a() {
                switch (i11) {
                    case 0:
                        d dVar = this.f7688b;
                        List list6 = dVar.f7694d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i112 = 0; i112 < size; i112++) {
                            qi.q.u0(arrayList, (List) ((ej.a) list6.get(i112)).a());
                        }
                        dVar.f7694d = qi.s.f13520a;
                        return arrayList;
                    default:
                        d dVar2 = this.f7688b;
                        List list7 = dVar2.f7695e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            qi.q.u0(arrayList2, (List) ((ej.a) list7.get(i12)).a());
                        }
                        dVar2.f7695e = qi.s.f13520a;
                        return arrayList2;
                }
            }
        });
    }
}
