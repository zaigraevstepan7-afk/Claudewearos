package fd;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final c f6727b = new c(new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f6728a;

    public /* synthetic */ c(Bundle bundle) {
        this.f6728a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = ((c) obj).f6728a;
        Bundle bundle2 = this.f6728a;
        if (bundle2 == null || bundle == null) {
            return bundle2 == bundle;
        }
        if (bundle2.size() == bundle.size()) {
            Set<String> setKeySet = bundle2.keySet();
            if (setKeySet.containsAll(bundle.keySet())) {
                for (String str : setKeySet) {
                    if (!e0.l(bundle2.get(str), bundle.get(str))) {
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6728a});
    }
}
