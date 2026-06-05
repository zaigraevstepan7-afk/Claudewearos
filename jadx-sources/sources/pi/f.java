package pi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f12997a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f12998b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f12999c;

    static {
        f fVar = new f("SYNCHRONIZED", 0);
        f fVar2 = new f("PUBLICATION", 1);
        f12997a = fVar2;
        f fVar3 = new f("NONE", 2);
        f12998b = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        f12999c = fVarArr;
        u0.c.j(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f12999c.clone();
    }
}
