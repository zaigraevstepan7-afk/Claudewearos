package t0;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import g3.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import k0.t0;
import l3.t;
import ra.p0;
import u6.v;
import v0.u0;
import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final View f15385a;

    /* renamed from: b, reason: collision with root package name */
    public final j f15386b;

    /* renamed from: e, reason: collision with root package name */
    public t0 f15389e;

    /* renamed from: f, reason: collision with root package name */
    public u0 f15390f;

    /* renamed from: g, reason: collision with root package name */
    public h2 f15391g;

    /* renamed from: l, reason: collision with root package name */
    public Rect f15395l;

    /* renamed from: m, reason: collision with root package name */
    public final n f15396m;

    /* renamed from: c, reason: collision with root package name */
    public ej.c f15387c = new p0(26);

    /* renamed from: d, reason: collision with root package name */
    public ej.c f15388d = new p0(27);

    /* renamed from: h, reason: collision with root package name */
    public t f15392h = new t("", m0.f7143b, 4);

    /* renamed from: i, reason: collision with root package name */
    public l3.j f15393i = l3.j.f9913g;
    public final ArrayList j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final Object f15394k = v.P(pi.f.f12998b, new q0.k(this, 10));

    public q(View view, lb.p0 p0Var, j jVar) {
        this.f15385a = view;
        this.f15386b = jVar;
        this.f15396m = new n(p0Var, jVar);
    }

    public final r a(EditorInfo editorInfo) {
        int i10;
        int i11;
        t tVar = this.f15392h;
        String str = tVar.f9937a.f7081b;
        long j = tVar.f9938b;
        l3.j jVar = this.f15393i;
        int i12 = jVar.f9918e;
        int i13 = jVar.f9917d;
        boolean z2 = jVar.f9914a;
        if (i12 == 1) {
            i10 = z2 ? 6 : 0;
        } else if (i12 == 0) {
            i10 = 1;
        } else if (i12 == 2) {
            i10 = 2;
        } else if (i12 == 6) {
            i10 = 5;
        } else if (i12 == 5) {
            i10 = 7;
        } else if (i12 == 3) {
            i10 = 3;
        } else if (i12 == 4) {
            i10 = 4;
        } else {
            if (i12 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i10;
        n3.b bVar = jVar.f9919f;
        if (fj.l.b(bVar, n3.b.f11896c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(qi.m.s0(bVar));
            Iterator it = bVar.f11897a.iterator();
            while (it.hasNext()) {
                arrayList.add(((n3.a) it.next()).f11895a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i13 == 1) {
            i11 = 1;
        } else if (i13 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i11 = 1;
        } else if (i13 == 3) {
            i11 = 2;
        } else if (i13 == 4) {
            i11 = 3;
        } else if (i13 == 5) {
            i11 = 17;
        } else if (i13 == 6) {
            i11 = 33;
        } else if (i13 == 7) {
            i11 = 129;
        } else if (i13 == 8) {
            i11 = 18;
        } else {
            if (i13 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i11 = 8194;
        }
        editorInfo.inputType = i11;
        if (!z2 && (i11 & 1) == 1) {
            editorInfo.inputType = 131072 | i11;
            if (jVar.f9918e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i14 = editorInfo.inputType;
        if ((i14 & 1) == 1) {
            int i15 = jVar.f9915b;
            if (i15 == 1) {
                editorInfo.inputType = i14 | 4096;
            } else if (i15 == 2) {
                editorInfo.inputType = i14 | 8192;
            } else if (i15 == 3) {
                editorInfo.inputType = i14 | 16384;
            }
            if (jVar.f9916c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i16 = m0.f7144c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        u3.c.o(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!s0.d.f14713a || i13 == 7 || i13 == 8) {
            u3.c.r(editorInfo, false);
        } else {
            u3.c.r(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(qi.k.c0(new Class[]{q6.e.n(), q6.e.A(), q6.e.w(), q6.e.y(), q6.e.B(), q6.e.C(), q6.e.D()}));
            editorInfo.setSupportedHandwritingGesturePreviews(cg.b.M(q6.e.n(), q6.e.A(), q6.e.w(), q6.e.y()));
        }
        o oVar = p.f15384a;
        if (r5.k.d()) {
            r5.k.a().i(editorInfo);
        }
        r rVar = new r(this.f15392h, new p7.k(this, 24), this.f15393i.f9916c, this.f15389e, this.f15390f, this.f15391g);
        this.j.add(new WeakReference(rVar));
        return rVar;
    }
}
