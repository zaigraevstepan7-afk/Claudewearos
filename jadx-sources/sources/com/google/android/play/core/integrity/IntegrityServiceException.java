package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class IntegrityServiceException extends com.google.android.gms.common.api.j {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f4000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i10, Throwable th2) {
        super(new Status(i10, "Integrity API error (" + i10 + "): " + com.google.android.play.core.integrity.model.a.a(i10) + ".", null, null));
        Locale locale = Locale.ROOT;
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f4000a = th2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f4000a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
