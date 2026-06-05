package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f2[] f18278a;

    static {
        f2[] f2VarArr = {new f2("Shown", 0), new f2("Hidden", 1)};
        f18278a = f2VarArr;
        u0.c.j(f2VarArr);
    }

    public static f2 valueOf(String str) {
        return (f2) Enum.valueOf(f2.class, str);
    }

    public static f2[] values() {
        return (f2[]) f18278a.clone();
    }
}
