package ta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f16225a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f16226b;

    /* renamed from: c, reason: collision with root package name */
    public static final z f16227c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f16228d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z[] f16229e;

    static {
        z zVar = new z("Search", 0);
        f16225a = zVar;
        z zVar2 = new z("Dots", 1);
        f16226b = zVar2;
        z zVar3 = new z("Input", 2);
        f16227c = zVar3;
        z zVar4 = new z("PillSelector", 3);
        f16228d = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f16229e = zVarArr;
        u0.c.j(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f16229e.clone();
    }
}
