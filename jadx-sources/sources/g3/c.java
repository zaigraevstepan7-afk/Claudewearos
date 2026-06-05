package g3;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f7040a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7041b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7042c;

    public c() {
        this.f7040a = new StringBuilder(16);
        this.f7041b = new ArrayList();
        this.f7042c = new ArrayList();
        new ArrayList();
    }

    public final void a(f fVar) {
        StringBuilder sb2 = this.f7040a;
        int length = sb2.length();
        sb2.append(fVar.f7081b);
        List list = fVar.f7080a;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) list.get(i10);
                this.f7042c.add(new b(dVar.f7045a, dVar.f7046b + length, dVar.f7047c + length, dVar.f7048d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof f) {
            a((f) charSequence);
            return this;
        }
        this.f7040a.append(charSequence);
        return this;
    }

    public final void b(String str) {
        this.f7040a.append(str);
    }

    public final void c(int i10) {
        ArrayList arrayList = this.f7041b;
        if (i10 >= arrayList.size()) {
            m3.a.b(i10 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i10) {
            if (arrayList.isEmpty()) {
                m3.a.b("Nothing to pop.");
            }
            ((b) arrayList.remove(arrayList.size() - 1)).f7037c = this.f7040a.length();
        }
    }

    public final int d(f0 f0Var) {
        b bVar = new b(f0Var, this.f7040a.length(), 0, 12);
        this.f7041b.add(bVar);
        this.f7042c.add(bVar);
        return r5.size() - 1;
    }

    public final f e() {
        StringBuilder sb2 = this.f7040a;
        String string = sb2.toString();
        ArrayList arrayList = this.f7042c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((b) arrayList.get(i10)).a(sb2.length()));
        }
        return new f(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        boolean z2 = charSequence instanceof f;
        StringBuilder sb2 = this.f7040a;
        if (z2) {
            f fVar = (f) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) fVar.f7081b, i10, i11);
            List listA = g.a(fVar, i10, i11, null);
            if (listA != null) {
                int size = listA.size();
                for (int i12 = 0; i12 < size; i12++) {
                    d dVar = (d) listA.get(i12);
                    this.f7042c.add(new b(dVar.f7045a, dVar.f7046b + length, dVar.f7047c + length, dVar.f7048d));
                }
            }
            return this;
        }
        sb2.append(charSequence, i10, i11);
        return this;
    }

    public c(f fVar) {
        this();
        a(fVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c6) {
        this.f7040a.append(c6);
        return this;
    }
}
