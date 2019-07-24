import com.amazonaws.auth.AWSCredentialsProviderChain
import com.amazonaws.auth.profile.ProfileCredentialsProvider
import fm.sbt.S3URLHandler

s3CredentialsProvider := { bucket: String =>
  new AWSCredentialsProviderChain(
    new ProfileCredentialsProvider("profile vital-master"),
    new ProfileCredentialsProvider("default"),
    S3URLHandler.defaultCredentialsProviderChain(bucket)
  )
}

// Publishing
publishTo := {
  val repo = "s3://vital-repo.s3-us-west-2.amazonaws.com/maven/"
  if (isSnapshot.value)
    Some("Snapshots" at repo + "snapshots")
  else
    Some("Releases" at repo + "releases")
}
publishMavenStyle := true
