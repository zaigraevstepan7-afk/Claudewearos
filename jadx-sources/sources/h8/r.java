package h8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qj.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r implements m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7725e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p f7726a;

    /* renamed from: b, reason: collision with root package name */
    public final qh.c f7727b;

    /* renamed from: c, reason: collision with root package name */
    public final d f7728c;

    /* renamed from: d, reason: collision with root package name */
    public volatile /* synthetic */ int f7729d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(r.class, "d");
    }

    public r(p pVar) {
        this.f7726a = pVar;
        final int i10 = 0;
        b0.b(yd.f.W(b0.c(), new s(qj.w.f13631a, i10)));
        b1.i iVar = new b1.i();
        iVar.f1488b = new WeakReference(this);
        iVar.f1489c = new v8.a(iVar, this);
        final int i11 = 1;
        iVar.f1490d = new c2.d(iVar, i11);
        qh.c cVar = new qh.c(this);
        this.f7727b = cVar;
        d dVar = pVar.f7717f;
        ak.v vVar = new ak.v();
        vVar.f730a = qi.l.T0(dVar.f7691a);
        vVar.f731b = qi.l.T0(dVar.f7692b);
        vVar.f732c = qi.l.T0(dVar.f7693c);
        List list = (List) dVar.f7696f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a7.e((pi.h) it.next(), 10));
        }
        vVar.f733d = arrayList;
        List<k8.j> list2 = (List) dVar.f7697g.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (final k8.j jVar : list2) {
            arrayList2.add(new ej.a() { // from class: h8.c
                @Override // ej.a
                public final Object a() {
                    switch (i10) {
                    }
                    return yd.f.K(jVar);
                }
            });
        }
        vVar.f734e = arrayList2;
        ArrayList arrayList3 = (ArrayList) vVar.f730a;
        ArrayList arrayList4 = (ArrayList) vVar.f733d;
        ArrayList arrayList5 = (ArrayList) vVar.f732c;
        ArrayList arrayList6 = (ArrayList) vVar.f734e;
        r8.e eVar = pVar.f7713b;
        Object obj = eVar.f13858n.f7703a.get(n.f7707a);
        int i12 = 3;
        int i13 = 2;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList4.add(new l(i13));
            arrayList6.add(new l(i12));
        }
        vVar.e(new p8.a(i10), fj.w.a(Uri.class));
        vVar.e(new p8.a(i12), fj.w.a(Integer.class));
        arrayList5.add(new pi.h(new o8.a(0), fj.w.a(x.class)));
        vVar.d(new m8.a(0), fj.w.a(x.class));
        vVar.d(new m8.a(4), fj.w.a(x.class));
        vVar.d(new m8.a(9), fj.w.a(x.class));
        vVar.d(new m8.a(6), fj.w.a(Drawable.class));
        vVar.d(new m8.a(1), fj.w.a(Bitmap.class));
        gf.f fVar = o.f7708a;
        Object obj2 = eVar.f13858n.f7703a.get(o.f7708a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i14 = yj.j.f20326a;
        yj.i iVar2 = new yj.i(iIntValue);
        int i15 = Build.VERSION.SDK_INT;
        Object obj3 = k8.m.f9483a;
        if (i15 >= 29) {
            Object obj4 = eVar.f13858n.f7703a.get(o.f7710c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = eVar.f13858n.f7703a.get(o.f7709b);
                if (((k8.m) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    final k8.r rVar = new k8.r(iVar2);
                    arrayList6.add(new ej.a() { // from class: h8.c
                        @Override // ej.a
                        public final Object a() {
                            switch (i11) {
                            }
                            return yd.f.K(rVar);
                        }
                    });
                }
            }
        }
        Object obj6 = eVar.f13858n.f7703a.get(o.f7709b);
        final k8.c cVar2 = new k8.c(iVar2, (k8.m) (obj6 != null ? obj6 : obj3));
        arrayList6.add(new ej.a() { // from class: h8.c
            @Override // ej.a
            public final Object a() {
                switch (i11) {
                }
                return yd.f.K(cVar2);
            }
        });
        vVar.e(new p8.a(i11), fj.w.a(File.class));
        vVar.d(new m8.a(8), fj.w.a(x.class));
        vVar.d(new m8.a(3), fj.w.a(ByteBuffer.class));
        vVar.e(new p8.a(4), fj.w.a(String.class));
        vVar.e(new p8.a(2), fj.w.a(kk.t.class));
        arrayList5.add(new pi.h(new o8.a(1), fj.w.a(x.class)));
        arrayList5.add(new pi.h(new o8.a(2), fj.w.a(x.class)));
        vVar.d(new m8.a(7), fj.w.a(x.class));
        vVar.d(new m8.a(2), fj.w.a(byte[].class));
        vVar.d(new m8.a(5), fj.w.a(x.class));
        arrayList3.add(new n8.f(this, iVar, cVar));
        this.f7728c = new d(u0.c.o(arrayList3), u0.c.o((ArrayList) vVar.f731b), u0.c.o(arrayList5), u0.c.o(arrayList4), u0.c.o(arrayList6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
    
        if (r4.a(r8) == r9) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8 A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:15:0x0038, B:92:0x0186, B:94:0x018c, B:101:0x01b1, B:97:0x0198, B:100:0x01ab, B:102:0x01b8, B:104:0x01bc, B:107:0x01c8, B:108:0x01cd), top: B:128:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e0 A[Catch: all -> 0x01ed, TRY_LEAVE, TryCatch #2 {all -> 0x01ed, blocks: (B:113:0x01dc, B:115:0x01e0, B:120:0x01ef, B:121:0x01f5), top: B:127:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ef A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #2 {all -> 0x01ed, blocks: (B:113:0x01dc, B:115:0x01e0, B:120:0x01ef, B:121:0x01f5), top: B:127:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b A[Catch: all -> 0x006f, TryCatch #5 {all -> 0x006f, blocks: (B:29:0x006a, B:78:0x0124, B:80:0x012b, B:82:0x0135, B:83:0x013f, B:84:0x0142), top: B:131:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018c A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:15:0x0038, B:92:0x0186, B:94:0x018c, B:101:0x01b1, B:97:0x0198, B:100:0x01ab, B:102:0x01b8, B:104:0x01bc, B:107:0x01c8, B:108:0x01cd), top: B:128:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(r8.g r16, int r17, vi.c r18) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.r.a(r8.g, int, vi.c):java.lang.Object");
    }

    public final Object b(r8.g gVar, vi.c cVar) {
        t8.a aVar = gVar.f13870c;
        return ((gVar.f13881o instanceof s8.f) || ((androidx.lifecycle.v) n.d(gVar, r8.i.f13895e)) != null) ? b0.h(new ab.s(this, gVar, null, 11), cVar) : a(gVar, 1, cVar);
    }

    public final q8.c c() {
        return (q8.c) this.f7726a.f7715d.getValue();
    }

    public final void d(r8.c cVar, t8.a aVar, f fVar) {
        r8.g gVar = cVar.f13829b;
        if (aVar instanceof i8.j) {
            u8.g gVarA = ((u8.f) n.d(gVar, r8.i.f13891a)).a((i8.j) aVar, cVar);
            if (!(gVarA instanceof u8.e)) {
                fVar.getClass();
                gVarA.a();
            }
        }
        fVar.getClass();
        gVar.getClass();
    }
}
