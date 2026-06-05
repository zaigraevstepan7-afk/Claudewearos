package bj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f1775c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1776a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1777b;

    static {
        b[] bVarArr = b.f1774a;
        f1775c = new a(-1, false, false);
        new c(-1, true, false);
        new c(76, false, true);
        new c(64, false, true);
    }

    public c(int i10, boolean z2, boolean z10) {
        b[] bVarArr = b.f1774a;
        this.f1776a = z2;
        this.f1777b = z10;
        if (z2 && z10) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
