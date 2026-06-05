package v0;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import f1.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ti.h f17450a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17451b;

    /* renamed from: c, reason: collision with root package name */
    public final s f17452c;

    /* renamed from: d, reason: collision with root package name */
    public final n3.b f17453d;

    /* renamed from: f, reason: collision with root package name */
    public TextClassifier f17455f;

    /* renamed from: e, reason: collision with root package name */
    public final yj.c f17454e = new yj.c();

    /* renamed from: g, reason: collision with root package name */
    public final j1 f17456g = f1.s.A(null);

    /* renamed from: h, reason: collision with root package name */
    public final Object f17457h = new Object();

    public p(ti.h hVar, Context context, s sVar, n3.b bVar) {
        this.f17450a = hVar;
        this.f17451b = context;
        this.f17452c = sVar;
        this.f17453d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(v0.p r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, vi.c r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.p.a(v0.p, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, vi.c):java.lang.Object");
    }

    public final LocaleList b() {
        n3.b bVar = this.f17453d;
        if (bVar == null) {
            return new LocaleList(((n3.a) n3.c.f11899a.j().f11897a.get(0)).f11895a);
        }
        ArrayList arrayList = new ArrayList(qi.m.s0(bVar));
        Iterator it = bVar.f11897a.iterator();
        while (it.hasNext()) {
            arrayList.add(((n3.a) it.next()).f11895a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
