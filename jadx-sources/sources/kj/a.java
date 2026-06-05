package kj;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a implements Iterable, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f9656a;

    /* renamed from: b, reason: collision with root package name */
    public final char f9657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9658c = 1;

    public a(char c6, char c10) {
        this.f9656a = c6;
        this.f9657b = (char) u0.c.n(c6, c10, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f9656a, this.f9657b, this.f9658c);
    }
}
