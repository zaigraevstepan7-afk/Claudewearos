package va;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f18003a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f18004b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f18005c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u[] f18006d;

    static {
        u uVar = new u("CREATE", 0);
        f18003a = uVar;
        u uVar2 = new u("CONFIRM", 1);
        f18004b = uVar2;
        u uVar3 = new u("VERIFY", 2);
        f18005c = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        f18006d = uVarArr;
        u0.c.j(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f18006d.clone();
    }
}
